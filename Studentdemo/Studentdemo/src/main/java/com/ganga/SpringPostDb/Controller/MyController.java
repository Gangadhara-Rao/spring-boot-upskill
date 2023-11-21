package com.ganga.SpringPostDb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ganga.SpringPostDb.Repository.StudentRepository;
import com.ganga.SpringPostDb.model.Student;

@RestController
@RequestMapping("/student")
public class MyController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/signin")
	public ResponseEntity<?> addStudents(@RequestBody Student Student){
		Student save = this.studentRepository.save(Student);
		return ResponseEntity.ok(save);
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> getStudents(){
		return ResponseEntity.ok(this.studentRepository.findAll());
	}

	@DeleteMapping("/de")
	public String deleteStudent(@RequestParam int id)
    {
        studentRepository.deleteById(id);
        return "Deleted successfully";
    }
	
	@PutMapping("/update")
	public ResponseEntity<?> updateStudents(@RequestBody Student Student){
		Student save = this.studentRepository.save(Student);
		return ResponseEntity.ok(save);
	}

}
