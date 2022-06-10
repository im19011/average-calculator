package im19011;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "im19011.ave1", urlPatterns = { "/im19011.ave1" })

public class ave1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws  IOException, ServletException {

		// 出力形式を設定する
		response.setContentType("text/html; charset=UTF-8");

		// 出力先 out を定義する
		PrintWriter out = response.getWriter();

		// HTTPリクエストのエンコーディングを UTF-8 とする
		request.setCharacterEncoding("utf-8");

		// HTMLドキュメントを出力する
		out.println("<html><head>");
		out.println("<title>ave1</title>");
		out.println("</head><body>");
		out.println("<h1>平均</h1><hr>");

		HttpSession session = request.getSession(true);

		String choice = request.getParameter("choice");
		
		out.println("<form action=\"/webapps/im19011.ave2\" method=\"GET\">");
		
		out.println("<h2>(x,y)に値を入力してください。</h2>");

		out.println("01 : " + "(" + "<input type=\"text\" name=\"x1\" size=5>" + "," + "<input type=\"text\" name=\"y1\" size=5>" + ")" + "<br>");
		out.println("02 : " + "(" + "<input type=\"text\" name=\"x2\" size=5>" + "," + "<input type=\"text\" name=\"y2\" size=5>" + ")" + "<br>");
		out.println("03 : " + "(" + "<input type=\"text\" name=\"x3\" size=5>" + "," + "<input type=\"text\" name=\"y3\" size=5>" + ")" + "<br>");
		out.println("04 : " + "(" + "<input type=\"text\" name=\"x4\" size=5>" + "," + "<input type=\"text\" name=\"y4\" size=5>" + ")" + "<br>");
		out.println("05 : " + "(" + "<input type=\"text\" name=\"x5\" size=5>" + "," + "<input type=\"text\" name=\"y5\" size=5>" + ")" + "<br>");
		out.println("06 : " + "(" + "<input type=\"text\" name=\"x6\" size=5>" + "," + "<input type=\"text\" name=\"y6\" size=5>" + ")" + "<br>");
		out.println("07 : " + "(" + "<input type=\"text\" name=\"x7\" size=5>" + "," + "<input type=\"text\" name=\"y7\" size=5>" + ")" + "<br>");
		out.println("08 : " + "(" + "<input type=\"text\" name=\"x8\" size=5>" + "," + "<input type=\"text\" name=\"y8\" size=5>" + ")" + "<br>");
		out.println("09 : " + "(" + "<input type=\"text\" name=\"x9\" size=5>" + "," + "<input type=\"text\" name=\"y9\" size=5>" + ")" + "<br>");
		out.println("10 : " + "(" + "<input type=\"text\" name=\"x10\" size=5>" + "," + "<input type=\"text\" name=\"y10\" size=5>" + ")" + "<br>");
		out.println("11 : " + "(" + "<input type=\"text\" name=\"x11\" size=5>" + "," + "<input type=\"text\" name=\"y11\" size=5>" + ")" + "<br>");
		out.println("12 : " + "(" + "<input type=\"text\" name=\"x12\" size=5>" + "," + "<input type=\"text\" name=\"y12\" size=5>" + ")" + "<br>");
		out.println("13 : " + "(" + "<input type=\"text\" name=\"x13\" size=5>" + "," + "<input type=\"text\" name=\"y13\" size=5>" + ")" + "<br>");
		out.println("14 : " + "(" + "<input type=\"text\" name=\"x14\" size=5>" + "," + "<input type=\"text\" name=\"y14\" size=5>" + ")" + "<br>");
		out.println("15 : " + "(" + "<input type=\"text\" name=\"x15\" size=5>" + "," + "<input type=\"text\" name=\"y15\" size=5>" + ")" + "<br>");
		out.println("16 : " + "(" + "<input type=\"text\" name=\"x16\" size=5>" + "," + "<input type=\"text\" name=\"y16\" size=5>" + ")" + "<br>");
		out.println("17 : " + "(" + "<input type=\"text\" name=\"x17\" size=5>" + "," + "<input type=\"text\" name=\"y17\" size=5>" + ")" + "<br>");
		out.println("18 : " + "(" + "<input type=\"text\" name=\"x18\" size=5>" + "," + "<input type=\"text\" name=\"y18\" size=5>" + ")" + "<br>");
		out.println("19 : " + "(" + "<input type=\"text\" name=\"x19\" size=5>" + "," + "<input type=\"text\" name=\"y19\" size=5>" + ")" + "<br>");
		out.println("20 : " + "(" + "<input type=\"text\" name=\"x20\" size=5>" + "," + "<input type=\"text\" name=\"y20\" size=5>" + ")" + "<br>");

		out.println("<input type=\"submit\" value=\"送信\">");
		out.println("<input type=\"reset\" value=\"クリア\">");
		out.println("</form>");
		out.println("<hr>");
		out.println("</body></html>");
    }
}
