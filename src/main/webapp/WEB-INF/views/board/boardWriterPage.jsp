<%@page import="com.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%MemberVO vo = (MemberVO)session.getAttribute("member"); %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
</script>
</head>
<body>
 <div col-md-5 img-thumbnail">
                    <div id="feedback"> <div class="container">
<div class="col-md-5">
    <div class="form-area">  
        <form role="form" action="/board/boardWriter" method="post">
        <br style="clear:both">
                    <h3 style="margin-bottom: 25px; text-align: center;">Board Writer</h3>
        			<div class="form-group">
						<input type="text" class="form-control" id="btitle" name="btitle" placeholder="Title" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="bwriter" name="bwriter" value="<%=vo.getMname() %>" placeholder="<%=vo.getMname() %>" readonly="readonly">
					</div>
                    <div class="form-group">
                    <textarea class="form-control" type="textarea" id="bcontent" name ="bcontent" placeholder="글을 작성해주세요" maxlength="140" rows="7"></textarea>
                        <span class="help-block"><p id="characterLeft" class="help-block ">You have reached the limit</p></span>                    
                    </div>
        <button type="submit" name="submit" class="btn btn-primary pull-right">Submit</button>
        </form>
    </div>
</div>
</div> </div> 
</body>
</html>