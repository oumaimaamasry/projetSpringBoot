package org.example.contollers;

import org.example.models.Emploi;
import org.example.services.EmploiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmploiController {
    @Autowired
    EmploiService emploiService;
    @RequestMapping("createEmploi")
    public String createEmploi(){
        return "createEmploi";
    }
    @RequestMapping("saveEmploi")
    public String saveEmploi(@ModelAttribute("emploi") Emploi emploi,
                                 ModelMap modelmap,ModelMap modelmap1){
        Emploi memo= emploiService.saveEmploi(emploi);
        String msgController="Serivce avec id : "+ memo.getId()+"est ajouté";
        modelmap.addAttribute("msgJsp",msgController);
        List<Emploi> emploisController = emploiService.getAllEmplois();
        modelmap1.addAttribute("emploisJsp",emploisController);
        return "emploiList";
    }
    @RequestMapping("listEmploi")
    public String EmploiList(ModelMap modelMap){
        List<Emploi> emploisController = emploiService.getAllEmplois();
        modelMap.addAttribute("emploisJsp",emploisController);
        return "emploiList";
    }
    @RequestMapping("deleteEmploi")
    public String deleteEmploi(@RequestParam("id") Long id, ModelMap modelMap){
        emploiService.deleteEmploiById(id);
        List<Emploi> emploisController = emploiService.getAllEmplois();
        modelMap.addAttribute("emploisJsp",emploisController);
        return "emploiList";

    }

    @RequestMapping("showEmploi")
    public String showEmploi(@RequestParam("id") Long id,ModelMap modelMap){
        Emploi emploiController = emploiService.getEmploi(id);
        modelMap.addAttribute("emploisJsp",emploiController);
        return "editEmploi";
    }
    @RequestMapping("updateEmploi")
    public String updateEmploi(@ModelAttribute("emploi") Emploi emploi,ModelMap modelMap){
        Emploi memo= emploiService.saveEmploi(emploi);
        List<Emploi> emploisController = emploiService.getAllEmplois();
        modelMap.addAttribute("emploisJsp",emploisController);
        return "emploiList";
    }
}
