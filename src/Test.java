package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class Test extends HttpServlet {

     @Override
     public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws ServletException, IOException {
          response.setContentType("text/html");
          PrintWriter out = response.getWriter();
          out.println("<html><body bgcolor='lightblue' text='darkblue'>");
          out.println("<h1>Hello, I AM SERVLET !!!</h1>");
          out.println("</body></html>");
          out.close();
     }

}

// compilation : javac -cp "../../lib/*" -d ../WEB-INF/classes Test.java
// deployment : copy Test.class to WEB-INF/classes

/*

trisha@MacBookAir src % javac -cp "../../lib/*" -d ../WEB-INF/classes Test.java
trisha@MacBookAir src % clear

trisha@MacBookAir src % cd ../WEB-INF/classes
find .
.
./com
./com/example
./com/example/Test.class
trisha@MacBookAir classes % 
 */
