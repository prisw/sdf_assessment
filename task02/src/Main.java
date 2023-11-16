import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
//import java.io.InputStream;
import java.io.InputStreamReader;
//import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;


public class Main {

   public static void main(String[] args) throws Exception {
      final Socket socket = new Socket("localhost", 5000);

      final InputStreamReader isr = new InputStreamReader(socket.getInputStream());
      final BufferedReader br = new BufferedReader(isr);
      final OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
      final BufferedWriter bw = new BufferedWriter(osw);

      final Console cons = System.console();

      boolean stop = false;
      while (!stop) {
         String line = cons.readLine("> \n");
         line = line.trim();
         stop = "exit".equals(line);

         bw.write(line + "\n");
         bw.flush();

         if (stop)
            continue;

         line = br.readLine();
         System.out.printf(">> result: %s\n", line);

        //send back server the details

        osw.write("request id: \n");
        String requestid = cons.readLine(" $s\n");
        requestid = requestid.trim();
        bw.write(line + "\n");
        bw.flush();
        requestid = br.readLine();
        
        osw.write("name:\n");
        String name = cons.readLine(" $s\n");
        name = name.trim();
        bw.write(line + "\n");
        bw.flush();
        name = br.readLine();

        osw.write("email:\n");
        String email = cons.readLine(" $s\n");
        email = email.trim();
        bw.write(line + "\n");
        bw.flush();
        email = br.readLine();

        osw.write("items:\n");
        String items = cons.readLine(" $s\n");
        items = items.trim();
        bw.write(line + "\n");
        bw.flush();
        items = br.readLine();

        osw.write("spent:\n");
        String spent = cons.readLine(" $s\n");
        spent = spent.trim();
        bw.write(line + "\n");
        bw.flush();
        spent = br.readLine();

        osw.write("remaining:\n");
        String remaining = cons.readLine(" $s\n");
        remaining = remaining.trim();
        bw.write(line + "\n");
        bw.flush();
        remaining = br.readLine();

 


      }
      bw.flush();
      osw.flush();
      osw.close();
      isr.close();
      socket.close();
   }

   
       /*  //choosing products program
public void SendServer(){
    final Console cons = System.console();
        String line = cons.readLine("> \n");
         line = line.trim();
    int budget = line.contains(Double.parseDouble("budget"));
    int productValue = 0;
    for (int i = 0; i < productValue; i++);
    int curValue = budget - productValue;    
*/
}

        //reply back to server after choosing products
   


        /*int port = 5000;
        try (Socket socket = new Socket("localhost",port)) {
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter ows = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(ows);
  
            Console cons = System.console();
            String line = br.readLine();
            line = line.trim() + "\n";
  
            bw.write(line);
            bw.flush();

             while (true) {
                  String result = br.readLine();
                  result = result.trim();
                  System.out.printf(result , "\n");

           
            if (line.contains("request_id")) {
                String userInput = cons.readLine();
                bw.newLine();
                bw.flush();
            }

            
   } 

ows.flush();
ows.close();
isr.close();
socket.close();
   
} 

        } 

    
    }*/