package im19011;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "im19011.ave2", urlPatterns = { "/im19011.ave2" })

public class ave2 extends HttpServlet {
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
		out.println("<title>ave2</title>");
		out.println("</head><body>");
		out.println("<h1>平均</h1><hr>");

		HttpSession session = request.getSession(true);

		int xnum = 0;
		int ynum = 0;
		
		String  x1 = request.getParameter("x1");
		if(x1.length() == 0) {
			x1 = "0";
			xnum ++;
		}
		int xx1 = Integer.parseInt(x1);

		String  x2= request.getParameter("x2");
		if(x2.length() == 0) {
			x2 = "0";
			xnum ++;
		}
		int xx2 = Integer.parseInt(x2);
		
		String  x3= request.getParameter("x3");
		if(x3.length() == 0) {
			x3 = "0";
			xnum ++;
		}
		int xx3 = Integer.parseInt(x3);

		String  x4= request.getParameter("x4");
		if(x4.length() == 0) {
			x4 = "0";
			xnum ++;
		}
		int xx4 = Integer.parseInt(x4);

		String  x5= request.getParameter("x5");
		if(x5.length() == 0) {
			x5 = "0";
			xnum ++;
		}
		int xx5 = Integer.parseInt(x5);

		String  x6= request.getParameter("x6");
		if(x6.length() == 0) {
			x6 = "0";
			xnum ++;
		}
		int xx6 = Integer.parseInt(x6);

		String  x7= request.getParameter("x7");
		if(x7.length() == 0) {
			x7 = "0";
			xnum ++;
		}
		int xx7 = Integer.parseInt(x7);

		String  x8= request.getParameter("x8");
		if(x8.length() == 0) {
			x8 = "0";
			xnum ++;
		}
		int xx8 = Integer.parseInt(x8);

		String  x9= request.getParameter("x9");
		if(x9.length() == 0) {
			x9 = "0";
			xnum ++;
		}
		int xx9 = Integer.parseInt(x9);

		String  x10= request.getParameter("x10");
		if(x10.length() == 0) {
			x10 = "0";
			xnum ++;
		}
		int xx10 = Integer.parseInt(x10);
		
		String  x11= request.getParameter("x11");
		if(x11.length() == 0) {
			x11 = "0";
			xnum ++;
		}
		int xx11 = Integer.parseInt(x11);

		String  x12= request.getParameter("x12");
		if(x12.length() == 0) {
			x12 = "0";
			xnum ++;
		}
		int xx12 = Integer.parseInt(x12);

		String  x13= request.getParameter("x13");
		if(x13.length() == 0) {
			x13 = "0";
			xnum ++;
		}
		int xx13 = Integer.parseInt(x13);

		String  x14= request.getParameter("x14");
		if(x14.length() == 0) {
			x14 = "0";
			xnum ++;
		}
		int xx14 = Integer.parseInt(x14);

		String  x15= request.getParameter("x15");
		if(x15.length() == 0) {
			x15 = "0";
			xnum ++;
		}
		int xx15 = Integer.parseInt(x15);

		String  x16= request.getParameter("x16");
		if(x16.length() == 0) {
			x16 = "0";
			xnum ++;
		}
		int xx16 = Integer.parseInt(x16);

		String  x17= request.getParameter("x17");
		if(x17.length() == 0) {
			x17 = "0";
			xnum ++;
		}
		int xx17 = Integer.parseInt(x17);

		String  x18= request.getParameter("x18");
		if(x18.length() == 0) {
			x18 = "0";
			xnum ++;
		}
		int xx18 = Integer.parseInt(x18);

		String  x19= request.getParameter("x19");
		if(x19.length() == 0) {
			x19 = "0";
			xnum ++;
		}
		int xx19 = Integer.parseInt(x19);

		String  x20= request.getParameter("x20");
		if(x20.length() == 0) {
			x20 = "0";
			xnum ++;
		}
		int xx20 = Integer.parseInt(x20);

		String  y1= request.getParameter("y1");
		if(y1.length() == 0) {
			y1 = "0";
			ynum ++;
		}
		int yy1 = Integer.parseInt(y1);
		
		String  y2= request.getParameter("y2");
		if(y2.length() == 0) {
			y2 = "0";
			ynum ++;
		}
		int yy2 = Integer.parseInt(y2);

		String  y3= request.getParameter("y3");
		if(y3.length() == 0) {
			y3 = "0";
			ynum ++;
		}
		int yy3 = Integer.parseInt(y3);

		String  y4= request.getParameter("y4");
		if(y4.length() == 0) {
			y4 = "0";
			ynum ++;
		}
		int yy4 = Integer.parseInt(y4);

		String  y5= request.getParameter("y5");
		if(y5.length() == 0) {
			y5 = "0";
			ynum ++;
		}
		int yy5 = Integer.parseInt(y5);

		String  y6= request.getParameter("y6");
		if(y6.length() == 0) {
			y6 = "0";
			ynum ++;
		}
		int yy6 = Integer.parseInt(y6);

		String  y7= request.getParameter("y7");
		if(y7.length() == 0) {
			y7 = "0";
			ynum ++;
		}
		int yy7 = Integer.parseInt(y7);

		String  y8= request.getParameter("y8");
		if(y8.length() == 0) {
			y8 = "0";
			ynum ++;
		}
		int yy8 = Integer.parseInt(y8);

		String  y9= request.getParameter("y9");
		if(y9.length() == 0) {
			y9 = "0";
			ynum ++;
		}
		int yy9 = Integer.parseInt(y9);

		String  y10= request.getParameter("y10");
		if(y10.length() == 0) {
			y10 = "0";
			ynum ++;
		}
		int yy10 = Integer.parseInt(y10);

		String  y11= request.getParameter("y11");
		if(y11.length() == 0) {
			y11 = "0";
			ynum ++;
		}
		int yy11 = Integer.parseInt(y11);

		String  y12= request.getParameter("y12");
		if(y12.length() == 0) {
			y12 = "0";
			ynum ++;
		}
		int yy12 = Integer.parseInt(y12);

		String  y13= request.getParameter("y13");
		if(y13.length() == 0) {
			y13 = "0";
			ynum ++;
		}
		int yy13 = Integer.parseInt(y13);

		String  y14= request.getParameter("y14");
		if(y14.length() == 0) {
			y14 = "0";
			ynum ++;
		}
		int yy14 = Integer.parseInt(y14);

		String  y15= request.getParameter("y15");
		if(y15.length() == 0) {
			y15 = "0";
			ynum ++;
		}
		int yy15 = Integer.parseInt(y15);

		String  y16= request.getParameter("y16");
		if(y16.length() == 0) {
			y16 = "0";
			ynum ++;
		}
		int yy16 = Integer.parseInt(y16);

		String  y17= request.getParameter("y17");
		if(y17.length() == 0) {
			y17 = "0";
			ynum ++;
		}
		int yy17 = Integer.parseInt(y17);

		String  y18= request.getParameter("y18");
		if(y18.length() == 0) {
			y18 = "0";
			ynum ++;
		}
		int yy18 = Integer.parseInt(y18);

		String  y19= request.getParameter("y19");
		if(y19.length() == 0) {
			y19 = "0";
			ynum ++;
		}
		int yy19 = Integer.parseInt(y19);

		String  y20= request.getParameter("y20");
		if(y20.length() == 0) {
			y20 = "0";
			ynum ++;
		}
		int yy20 = Integer.parseInt(y20);

		int n = 20 - xnum;
		int nx = 20 - xnum;
		int ny = 20 - ynum;
		float x, y;
		float ave_x, ave_y;
		float var_x, var_y;
		float variance_x, variance_y;
		// double variance_x1, variance_y1;
		// float sd_x, sd_y;
		float cov, covariance;
		// float cc;
		float slope, intercept;

		//平均
		x = xx1 + xx2 + xx3 + xx4 + xx5 + xx6 + xx7 + xx8 + xx9 + xx10 + xx11 + xx12 + xx13 + xx14 + xx15 + xx16 + xx17 + xx18 + xx19 + xx20;
		ave_x = x / nx;/* 出力 */
		out.println("xの平均:" + ave_x + "<br>");

		y = yy1 + yy2 + yy3 + yy4 + yy5 + yy6 + yy7 + yy8 + yy9 + yy10 + yy11 + yy12 + yy13 + yy14 + yy15 + yy16 + yy17 + yy18 + yy19 + yy20;
		ave_y = y / ny;/* 出力 */
		out.println("yの平均:" + ave_y + "<br>");

		//分散
		var_x = ((xx1 - ave_x) * (xx1 - ave_x))
				+ ((xx2 - ave_x) * (xx2 - ave_x))
				+ ((xx3 - ave_x) * (xx3 - ave_x))
				+ ((xx4 - ave_x) * (xx4 - ave_x))
				+ ((xx5 - ave_x) * (xx5 - ave_x))
				+ ((xx6 - ave_x) * (xx6 - ave_x))
				+ ((xx7 - ave_x) * (xx7 - ave_x))
				+ ((xx8 - ave_x) * (xx8 - ave_x))
				+ ((xx9 - ave_x) * (xx9 - ave_x))
				+ ((xx10 - ave_x) * (xx10 - ave_x))
				+ ((xx11 - ave_x) * (xx11 - ave_x))
				+ ((xx12 - ave_x) * (xx12 - ave_x))
				+ ((xx13 - ave_x) * (xx13 - ave_x))
				+ ((xx14 - ave_x) * (xx14 - ave_x))
				+ ((xx15 - ave_x) * (xx15 - ave_x))
				+ ((xx16 - ave_x) * (xx16 - ave_x))
				+ ((xx17 - ave_x) * (xx17 - ave_x))
				+ ((xx18 - ave_x) * (xx18 - ave_x))
				+ ((xx19 - ave_x) * (xx19 - ave_x))
				+ ((xx20 - ave_x) * (xx20 - ave_x))
				- (xnum * (ave_x * ave_x));
		variance_x = var_x / nx;	/* 出力 */
		out.println("xの分散:" + variance_x + "<br>");
				
		var_y = ((yy1 - ave_y) * (yy1 - ave_y))
				+ ((yy2 - ave_y) * (yy2 - ave_y))
				+ ((yy3 - ave_y) * (yy3 - ave_y))
				+ ((yy4 - ave_y) * (yy4 - ave_y))
				+ ((yy5 - ave_y) * (yy5 - ave_y))
				+ ((yy6 - ave_y) * (yy6 - ave_y))
				+ ((yy7 - ave_y) * (yy7 - ave_y))
				+ ((yy8 - ave_y) * (yy8 - ave_y))
				+ ((yy9 - ave_y) * (yy9 - ave_y))
				+ ((yy10 - ave_y) * (yy10 - ave_y))
				+ ((yy11 - ave_y) * (yy11 - ave_y))
				+ ((yy12 - ave_y) * (yy12 - ave_y))
				+ ((yy13 - ave_y) * (yy13 - ave_y))
				+ ((yy14 - ave_y) * (yy14 - ave_y))
				+ ((yy15 - ave_y) * (yy15 - ave_y))
				+ ((yy16 - ave_y) * (yy16 - ave_y))
				+ ((yy17 - ave_y) * (yy17 - ave_y))
				+ ((yy18 - ave_y) * (yy18 - ave_y))
				+ ((yy19 - ave_y) * (yy19 - ave_y))
				+ ((yy20 - ave_y) * (yy20 - ave_y))
				- (ynum * (ave_y * ave_y));
		variance_y = var_y / ny;/* 出力 */
		out.println("yの分散:" + variance_y + "<br>");

		//標準偏差
		// variance_x1 = Double.parseDouble(Float.toString(variance_x));
    	// sd_x = Math.sqrt(variance_x1);
		// out.println("xの:標準偏差" + sd_x + "<br>");

		// variance_y1 = Double.parseDouble(Float.toString(variance_y));
		// sd_y = Math.sqrt(variance_y1);
		// out.println("yの:標準偏差" + sd_y + "<br>");

		//共分散
		cov = ((xx1 - ave_x) * (yy1 - ave_y))
				+ ((xx2 - ave_x) * (yy2 - ave_y))
				+ ((xx3 - ave_x) * (yy3 - ave_y))
				+ ((xx4 - ave_x) * (yy4 - ave_y))
				+ ((xx5 - ave_x) * (yy5 - ave_y))
				+ ((xx6 - ave_x) * (yy6 - ave_y))
				+ ((xx7 - ave_x) * (yy7 - ave_y))
				+ ((xx8 - ave_x) * (yy8 - ave_y))
				+ ((xx9 - ave_x) * (yy9 - ave_y))
				+ ((xx10 - ave_x) * (yy10 - ave_y))
				+ ((xx11 - ave_x) * (yy11 - ave_y))
				+ ((xx12 - ave_x) * (yy12 - ave_y))
				+ ((xx13 - ave_x) * (yy13 - ave_y))
				+ ((xx14 - ave_x) * (yy14 - ave_y))
				+ ((xx15 - ave_x) * (yy15 - ave_y))
				+ ((xx16 - ave_x) * (yy16 - ave_y))
				+ ((xx17 - ave_x) * (yy17 - ave_y))
				+ ((xx18 - ave_x) * (yy18 - ave_y))
				+ ((xx19 - ave_x) * (yy19 - ave_y))
				+ ((xx20 - ave_x) * (yy20 - ave_y))
				- (xnum * (ave_x * ave_y));
		covariance = cov / n;
		out.println("共分散:" + covariance + "<br>");

		// //相関係数
		// // cc = cov / (sd_x * sd_y);
		// // out.println("相関係数:" + );

		//回帰直線
		slope = covariance / variance_x;
		out.println("回帰直線の傾き:" + slope + "<br>");

		intercept = ave_y - slope * ave_y;
		out.println("回帰直線の切片:" + intercept + "<br>");

		out.println("<form action=\"/webapps/im19011.ave1\" method=\"GET\">");
		out.println("<input type=\"submit\" value=\"もどる\">");
		out.println("<hr>");
		out.println("</body></html>");
    }
}
