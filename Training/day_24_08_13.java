package Training;

public class day_24_08_13 {

// 1.servlet에 대하여 설명하시오.(블로그 참고)
//서블릿(Servlet)이란 동적 웹 페이지를 만들 때 사용되는 자바 기반의 웹 애플리케이션 프로그래밍 기술이다. 
//서블릿은 웹 요청과 응답의 흐름을 간단한 메서드 호출만으로 체계적으로 다룰 수 있게 해준다.

    /* 클라이언트의 Request에 대해 동적으로 작동하는 웹 어플리케이션 컴포넌트
기존의 정적 웹 프로그램의 문제점을 보완하여 동적인 여러 가지 기능을 제공
JAVA의 스레드를 이용하여 동작
MVC패턴에서 컨트롤러로 이용됨
컨테이너에서 실행
보안 기능을 적용하기 쉬움 */
// 2.아래를 프로그래밍 하시오.(필수)
// /context명/gugudan.jsp - 구구단을 찍으시오(테이블로) 

/* <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>안녕하세요.</h1>
	<h1>구구단</</h1>
	<br>
	<table border="1" cellspacing="0">
		<tr bgcolor="pink">
		<%
			int i = 0;
		
			for( i = 2; i < 10; i++){
				out.print("<th width=100>" + i + "단</th>");
			}
		%>
		</tr>
		<%
			for( i = 1; i < 10; i++){
		%>
		<tr>
				<% for(int j = 2; j < 10; j++){
					out.print("<td align=center>" + j + "*" + i + "=" + j * i +"</td>");
				}%>
		</tr>
		<%		
			}
		%>
	</table>
</body>
</html> */


// 3.아래를 설명하시오.
// - 스크립틀릿 <% %> html에 java 코딩을 할 때 쓰임
// JSP란 쉽게 말하자면 html에 java 코드를 섞어 놓은 것.
// 작성된 JSP 페이지는 컨테이너가 알아서 JSP를 서블릿 소스 코드로 변환한 다음,
// 컴파일하여 완전한 서블릿 클래스로 만듬.
// JSP를 통해 정적인 HTML과 동적인 contents(HTTP 요청 파라미터)를 혼합하여 사용 가능 
//Tomcat(WAS)이 이미 만들어 둔 객체를 사용한다. ( ex. request, response, session 등)

// 4. 아래의 SQL을 완성하시오.
//  -- 부서테이블의 모든 데이터를 출력하라.
//  -- EMP테이블에서 각 사원의 직업, 사원번호, 이름, 입사일을 출력하라.
// --  EMP테이블에서 직업을 출력하되, 각 항목(ROW)가 중복되지 않게 출력하라.
// -- 생성한 DEPT01 부서 테이블의 모든 데이터를 삭제하는 쿼리문
// --부서명이 SALES인 부서를 emp01 에서 삭제 하시오
// ----'SMITH' 사원의 입사 날짜는 오늘로, 급여는 50으로, 커미션은 4000으로 수정하는 쿼리문
// --1982년에 입사한 사원의 입사일을 오늘로 수정하는 쿼리문
// --JOB 컬럼값이 MANAGER인 경우, 급여를 10% 인상하는 쿼리문
// --부서 번호가 10번인 사원의 부서 번호를 40번으로 수정
}




<table border="1" cellspacing="0">
<tr bgcolor="pink">
<%
	for( i = 2; i < 10; i++){
		out.print("<th width=100>" + i + "단</th>");
	}
%>
</tr>
<%
	for( i = 1; i < 10; i++){
%>
<tr>
		<% for(int j = 2; j < 10; j++){
			out.print("<td align=center>" + j + "*" + i + "=" + j * i +"</td>");
		}%>
</tr>
<%		
	}
 %>
</table>