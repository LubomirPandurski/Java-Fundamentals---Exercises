package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String Line = scanner.nextLine();
        while(!Line.equals("3:1")){
            String [] data = Line.split(" ");
            String command = data[0];
            switch (command){
                case "merge":
                    List<String> result = new ArrayList<>();
                    int start = Math.max(0, Integer.parseInt(data[1]));
                    int end = Math.min(Integer.parseInt(data[2]), strings.size());
                    if(start>0 && start<strings.size()){
                        result = strings.subList(0,start);
                    }
                    if(start<strings.size()) {
                        List<String> mergedElements = strings.subList(start, end + 1);
                        String merged = "";
                        for (String mergeElement : mergedElements) {
                            merged += mergeElement;
                        }
                        result.add(merged);
                    }
                    if(end+1 < strings.size()) {
                        result.addAll(strings.subList(end + 1, strings.size()));
                    }
                    strings = result;
                    break;
                case "divide":
                    break;
            }
            Line = scanner.nextLine();
        }
    }
}
