package task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderPreview {

    public static void main(String[] args) {
        // TO DO: Write your code below 
        String filePath = "dataset/dataset.csv";
        String line;
        int rowcount=0;
        int columncount=0;
        int m=0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            System.out.println("Columns:");
            if((line=br.readLine())!=null){
                String[] columns=line.split(",");
                columncount=columns.length;
                for(int i=0; i<columncount;i++){
                    System.out.print(columns[i]+"  ");
                }
                System.out.println();
                System.out.println("Total Columns:"+columncount);
                
            }
            System.out.println();
            System.out.println("First 5 Records:");
            System.out.println();
            while ((line=br.readLine()) !=null){
                rowcount++;
                if(m<5){

                    System.out.println(line.replace(",","  "));
                    m++;
                    
                }
                
                

            }
            System.out.println();
            System.out.println("Total Records (excluding header):"+ rowcount);

        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
