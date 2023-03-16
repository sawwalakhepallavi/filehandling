package com.bootcoding.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadEnterpriseFile {
    public static void main(String[] args) {
        ArrayList<Enterprise> enterpriseList = new ArrayList<>();
        try {

            File myObj = new File("D://bootcoding_java//filehandling//input.csv");
            Scanner myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                if(i == 0){
                    i++;
                    continue;
                }
                Enterprise enterprise = convertToEnterprise(data);
                enterpriseList.add(enterprise);
                System.out.println(enterprise);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("Please provide correct file path! Dhanywad!!!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Total Objects in Enterprise ArrayList is " + enterpriseList.size());
        // exception handling in java
        // suspected code identify

        //filter


        ArrayList<Enterprise> h01List = new ArrayList<>();
        for(int e = 0; e < enterpriseList.size(); e++){
            Enterprise enterprise = enterpriseList.get(e);
            if(enterprise.getVariableCode().equals("H01")){
                h01List.add(enterprise);
            }
        }

        System.out.println(h01List.size());
        List<Enterprise> h04 = enterpriseList.stream()
                .filter(enterprise -> enterprise.getVariableCode().equals("H04"))
                .collect(Collectors.toList());



    }

    private static Enterprise convertToEnterprise(String data) {

        String[] words = data.split(",");

        Enterprise e = new Enterprise();
        e.setYear(Integer.valueOf(words[0]));
        e.setVariableCode(words[1]);
        e.setVariableCategory(words[2]);
        e.setValue(Integer.valueOf(words[3]));
        return e;
    }
}
