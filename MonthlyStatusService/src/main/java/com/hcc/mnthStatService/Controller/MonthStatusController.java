package com.hcc.mnthStatService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcc.mnthStatService.Model.MonthStatus;
import com.hcc.mnthStatService.Repository.MonthlyStatusRepository;

@RestController
public class MonthStatusController {
	
	@Autowired
	private MonthlyStatusRepository mthStatusRepo;
	
	
	@PostMapping("/createMnthStat")
	public  String CreateMnthStat(@RequestBody MonthStatus monthStatus) {
		mthStatusRepo.save(monthStatus);
		
		return "Success";
		
	}
	
	@GetMapping("/mnthStatlist")
	public List<MonthStatus> getAllMonthStat(){
		
		return (List<MonthStatus>) mthStatusRepo.findAll();
	}
	
	@PutMapping("/updateMnthstatus/{Id}")
	public MonthStatus UpdateMonthStat(@PathVariable Long Id,@RequestBody MonthStatus monthStatus) {
		
		MonthStatus monthStatusout = new MonthStatus();
		
		monthStatusout=mthStatusRepo.save(monthStatus);
		
		return monthStatusout;
	}
	
	@DeleteMapping("deleteMnthStat/{Id}")
	public void deleteMnthStat(Long Id) {
		
		mthStatusRepo.deleteById(Id);
		
	}
	

}
