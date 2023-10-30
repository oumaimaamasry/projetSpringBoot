package org.example.contollers;

import org.example.models.Emploi;
import org.example.models.TypeEmploi;
import org.example.services.TypeEmploiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TypeEmploiController {
    @Autowired
    TypeEmploiService typeEmploiService;
    @RequestMapping("createTypeEmploi")
    public String createTypeEmploi(){
        return "createTypeEmploi";
    }
    @RequestMapping("saveTypeEmploi")
    public String saveTypeEmploi(@ModelAttribute("typeEmploi") TypeEmploi typeEmploi,
                             ModelMap modelmap,ModelMap modelmap1){
        TypeEmploi memo= typeEmploiService.saveTypeEmploi(typeEmploi);
        String msgController="Type serivce avec id : "+ memo.getId()+"est ajouté";
        modelmap.addAttribute("msgJsp",msgController);
        List<TypeEmploi> emploisController = typeEmploiService.getAllTypeEmplois();
        modelmap1.addAttribute("typeEmploisJsp",emploisController);
        return "typeEmploiList";
    }
    @RequestMapping("listTypeEmploi")
    public String TypeEmploiList(ModelMap modelMap){
        List<TypeEmploi> emploisController = typeEmploiService.getAllTypeEmplois();
        modelMap.addAttribute("typeEmploisJsp",emploisController);
        return "typeEmploiList";
    }
    @RequestMapping("deleteTypeEmploi")
    public String deleteTypeEmploi(@RequestParam("id") Long id, ModelMap modelMap){
        typeEmploiService.deleteTypeEmploiById(id);
        List<TypeEmploi> typeEmploisController = typeEmploiService.getAllTypeEmplois();
        modelMap.addAttribute("typeEmploisJsp",typeEmploisController);
        return "typeEmploiList";

    }

    @RequestMapping("showTypeEmploi")
    public String showTypeEmploi(@RequestParam("id") Long id,ModelMap modelMap){
        TypeEmploi typeEmploiController = typeEmploiService.getTypeEmploi(id);
        modelMap.addAttribute("typeEmploisJsp",typeEmploiController);
        return "editTypeEmploi";
    }
    @RequestMapping("updateTypeEmploi")
    public String updateTypeEmploi(@ModelAttribute("typdEmploi") TypeEmploi typeEmploi,ModelMap modelMap){
        TypeEmploi memo= typeEmploiService.saveTypeEmploi(typeEmploi);
        List<TypeEmploi> typeEmploisController = typeEmploiService.getAllTypeEmplois();
        modelMap.addAttribute("typeEmploisJsp",typeEmploisController);
        return "typeEmploiList";
    }

    @GetMapping("/createTypeEmploi")
    public String getAllEmplois(ModelMap modelMap) {
        List<Emploi> emplois = typeEmploiService.getAllEmplois();
        modelMap.addAttribute("emplois", emplois);
        return "createTypeEmploi";
    }

}
