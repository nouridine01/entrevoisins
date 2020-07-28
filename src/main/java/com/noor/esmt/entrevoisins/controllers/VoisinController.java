package com.noor.esmt.entrevoisins.controllers;

import com.noor.esmt.entrevoisins.entities.Voisin;
import com.noor.esmt.entrevoisins.repositories.VoisinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class VoisinController {
    @Autowired
    VoisinRepository voisinRepository;

    @RequestMapping(path = "create",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Voisin create(@RequestBody Voisin voisin){
        return voisinRepository.save(voisin);
    }

    @PatchMapping(path = "update",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Voisin update(@RequestBody Voisin voisin){
        return voisinRepository.save(voisin);
    }

    @RequestMapping(path = "delete/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable(name = "id") Long id ){
        try{
            voisinRepository.delete(voisinRepository.getOne(id));
            return "voisin supprimer avec succès";
        }catch(Exception e){
            throw new RuntimeException("erreur rencontre lors de la suppression de l'entité");

        }

    }

    @RequestMapping(path = "favoris/{idvoisin}/{idfavoris}",method = RequestMethod.GET)
    public String favori(@PathVariable(name = "idvoisin") Long idvoisin,@PathVariable(name = "idfavoris") Long idfavoris ){
        try{
            Voisin voisin =voisinRepository.getOne(idvoisin);
            Voisin favori = voisinRepository.getOne(idfavoris);
            String msg="";
            if(!voisin.getFavoris().contains(favori)){
                voisin.getFavoris().add(favori);
                msg="favoris ajouté avec succès";
            }else{
                voisin.getFavoris().remove(favori);
                msg="favoris retiré avec succès";
            }

            voisinRepository.save(voisin);
            return "{\"success\":"+msg+"}";
        }catch(Exception e){
            throw new RuntimeException("erreur rencontre lors de la suppression de l'entité");
        }

    }
}
