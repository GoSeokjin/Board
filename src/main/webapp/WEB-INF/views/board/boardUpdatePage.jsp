<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
$(document).ready(function(){
	var formObj = $("form[role='form']");
	
	$("#Save").on("click" , function(){
		formObj.submit();
	});

	$("#Cancel").on("click" , function(){
		self.location = "/board/boardMain";
	});
});
</script>
</head>
<body>
 <div col-md-5 img-thumbnail">
                    <div id="feedback"> <div class="container">
<div class="col-md-5">
    <div class="form-area">  
        <form role="form" action="/board/boardUpdate" method="post">
        <br style="clear:both">
                    <h3 style="margin-bottom: 25px; text-align: center;">Update Writer</h3>
        			<div class="form-group">
        				Title
						<input type="text" class="form-control" id="btitle" name="btitle" placeholder="${boardVO.btitle}" required>
					</div>
					<div class="form-group">
						Writer
						<input type="text" class="form-control" id="bwriter" name="bwriter" value="${boardVO.bwriter}" disabled>
					</div>
                    <div class="form-group">
                    Content
                    <textarea class="form-control" type="textarea" id="Content" name ="Content" placeholder="${boardVO.bcontent}" maxlength="140" rows="7"></textarea>
                        <span class="help-block"><p id="characterLeft" class="help-block ">You have reached the limit</p></span>                    
                    </div>
                    <input type="hidden" name="bno" value="${boardVO.bno}">
        </form>
        <button type="submit" id="Cancel" class="btn btn-primary pull-right">Cancel</button>
        <button type="submit" id="Save" class="btn btn-success pull-right">Save</button>
    </div>
</div>
</div> </div> 
</body>
</html>