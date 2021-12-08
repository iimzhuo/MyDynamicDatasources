### springboot 多数据源切换

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
