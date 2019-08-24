        package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.model.Sector;
import com.example.stockspring.model.User;
import com.example.stockspring.service.SectorService;
import com.example.stockspring.service.UserService;

@RestController
public class SectorController  {
	
	@Autowired
	SectorService sectorService;
	
	@GetMapping("/sector/insert/{sectorId}/{brief}/{sectorName}")
    public Sector storeUserDetails(@PathVariable("sectorId") int sectorId, @PathVariable("brief") String brief, @PathVariable("sectorName") String sectorName) throws Exception
    {
           Sector sectorDetails = new Sector(sectorId, brief, sectorName );
           return sectorService.Insert(sectorDetails);
    }


}
