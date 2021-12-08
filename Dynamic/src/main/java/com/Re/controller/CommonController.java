package com.Re.controller;

import com.Re.entity.Apply;
import com.Re.entity.ApproveStatus;
import com.Re.mapper.MasterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class CommonController {
    @Autowired
    private MasterMapper masterMapper;

    @GetMapping
    public Apply getApply(){
        Apply apply = masterMapper.selectApplyAndPerson();
        return apply;
    }
    
    @PostMapping("/upload")
    public String uploadFile(MultipartFile file){
        String filename = file.getOriginalFilename();
        String suffixName = filename.substring(filename.lastIndexOf("."));
        filename = "dyz"+suffixName;
        String filePaths="D:\\Study\\MyDynamicDatasources\\Dynamic\\src\\main\\resources";
        File dest = new File(filePaths +"/"+ filename);
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
}


