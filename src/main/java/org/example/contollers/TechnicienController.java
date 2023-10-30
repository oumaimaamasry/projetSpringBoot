package org.example.contollers;


import org.example.models.Technicien;
import org.example.models.TypeEmploi;
import org.example.services.TecnicienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class TechnicienController {
    @Autowired
    TecnicienService tecnicienService;
    @RequestMapping("createTechnicien")
    public String createTechnicien(){
        return "createTechnicien";
    }
    @GetMapping("/createTechnicien")
    public String getAllTypeEmplois(ModelMap modelMap) {
        List<TypeEmploi> typeEmplois = tecnicienService.getAllTypeEmplois();
        modelMap.addAttribute("typeEmplois", typeEmplois);
        return "createTechnicien";
    }
    @RequestMapping("saveTechnicien")
    public String saveTechnicien(@ModelAttribute("technicien") Technicien technicien,
    ModelMap modelmap,ModelMap modelMap1,@RequestParam("imageFile") MultipartFile imageFile){
        if (!imageFile.isEmpty()) {
            try {
                String uploadDir = "src/main/resources/public/images";
                String fileName = imageFile.getOriginalFilename();
                byte[] bytes = imageFile.getBytes();
                Path filePath = Paths.get(uploadDir, fileName);
                Files.write(filePath, bytes);
                technicien.setImageUrl(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Technicien memo= tecnicienService.saveTechnicien(technicien);
        String msgController="Technicien avec id : "+ memo.getId()+"est ajouté";
        modelmap.addAttribute("msgJsp",msgController);
        List<Technicien> techniciensController = tecnicienService.getAllTechniciens();
        modelMap1.addAttribute("technicienJsp",techniciensController);
        return "technicienList";

    }
    @RequestMapping("listTechnicien")
    public String technicienList(ModelMap modelMap){
        System.out.println("START");
        List<Technicien> techniciensController = tecnicienService.getAllTechniciens();
        modelMap.addAttribute("technicienJsp",techniciensController);
        return "technicienList";
    }
    @RequestMapping("deleteTechnicien")
    public String deleteTechnicien(@RequestParam("id") Long id,ModelMap modelMap){
        tecnicienService.deleteTechnicienById(id);
        List<Technicien> techniciensController = tecnicienService.getAllTechniciens();
        modelMap.addAttribute("technicienJsp",techniciensController);
        return "technicienList";

    }

    @RequestMapping("showTechnicien")
    public String showTechnicien(@RequestParam("id") Long id,ModelMap modelMap){
        Technicien technicienController = tecnicienService.getTechnicien(id);
        modelMap.addAttribute("technicienJsp",technicienController);
        return "editTechnicien";
    }
    @RequestMapping("updateTechnicien")
    public String updateTechnicien(@ModelAttribute("technicien") Technicien technicien,ModelMap modelMap){
        Technicien memo= tecnicienService.saveTechnicien(technicien);
        List<Technicien> techniciensController = tecnicienService.getAllTechniciens();
        modelMap.addAttribute("technicienJsp",techniciensController);
        return "technicienList";
    }

}
