package m2.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import m1.model.GuguService;

@WebServlet("/mvc/gugu2") // 사용자에게 보임, 실행
public class GuguServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { // 매개변수로 request 와 response이 자동으로 들어옴
		// 1. 요청 분석
		int dan = Integer.parseInt(request.getParameter("dan"));
		// 디버깅
		System.out.println(dan + "<-- dan GuguServlet.doGet()");
		
		// 2. 요청 처리 분석
			// GuguService 생성
		GuguService service = new GuguService();
		
			// 요청 처리!
		ArrayList<String> list = service.getGugudanList(dan);
		
		// [출력]은 다른 jsp 파일에게 위임한다. (요청&응답을 포워딩)
		//(처리를 위임하는것은 아님, 정확하게 구분하기) / (처리가 완료되면 매개변수(request, response)와 모델값(list)를 보내줘야 한다.
		request.setAttribute("list", list); // request안에 모델값(list) 모델값 , setAttribute(String, Object) 값을 꺼낼때는 Object를 형변환 하여 꺼내기.
		RequestDispatcher rd = request.getRequestDispatcher("/mvc/gugu2.jsp"); // ("") 출력할 위치 , 사용자는 모름
		
		// 포워딩
		rd.forward(request, response); // 여기선 모델값(list)를 추가로 넘길 수 없음, 그래서 request안에 데이터를 넣어서 보낸다.
		
	}

}
