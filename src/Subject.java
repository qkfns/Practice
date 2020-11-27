import java.io.*;

public class Subject {
    public static void main(String[] args) throws IOException {
        String subno = "0205";
        String subject = "프로그래밍";
        String subge = "자바 프로그래밍";
        String professor = "담당교수";

        String fpath = "c:Java/subject.dat";
        FileWriter fw = new FileWriter(fpath);

        String fmt = "%s , %s , %s , %s ";
        String data = String.format(fmt, subno,subject,subge,professor);

        fw.write(data);

        fw.close();

        fw = new FileWriter(fpath);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(data);

        bw.close();
        fw.close();

        FileReader fr = new FileReader(fpath);
        BufferedReader br = new BufferedReader(fr);

        while (br.ready()){
            String line = br.readLine();
            //System.out.println(line);

            String[] items = line.split(",");
            String result = String.format(fmt,items[0],items[1],items[2],items[3]);
            System.out.println(result);
        }
        br.close();
        fr.close();
    }
}
