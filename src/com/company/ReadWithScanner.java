package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ReadWithScanner {

    private Path fFilePath;
    private final static Charset ENCODING = StandardCharsets.UTF_8;

    public ReadWithScanner(String aFileName){
        fFilePath = Paths.get(aFileName);

    }

    public final void processLineByLine() throws IOException {
        try (Scanner scanner =  new Scanner(fFilePath, ENCODING.name())){
            while (scanner.hasNextLine()){
                processLine(scanner.nextLine());
            }
        }
    }


    public void processLine(String aLine){
        //use a second Scanner to parse the content of each line
        Scanner scanner = new Scanner(aLine);
        scanner.useDelimiter(";");
        List<int[]> data = new ArrayList<int[]>();
        if (scanner.hasNext()){
            //assumes the line has a certain structure
            int[] values = new int[7];
            for (int i = 0; i < 7; i++) {
                values[i] = Integer.parseInt(scanner.next());
                //System.out.println(Integer.parseInt(scanner.next()));
            }
            data.add(values);
            System.out.println(Arrays.toString(values));
        }
        else {
            System.out.println("Empty or invalid line. Unable to process.");
        }
    }

    private String quote(String aText){
        String QUOTE = "'";
        return QUOTE + aText + QUOTE;
    }

}

