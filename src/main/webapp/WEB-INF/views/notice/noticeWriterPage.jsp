<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        <form role="form" action="/notice/insert" method="post">
        <br style="clear:both">
                    <h3 style="margin-bottom: 25px; text-align: center;">notice Writer</h3>
        			<div class="form-group">
						<input type="text" class="form-control" id="noticeTitle" name="noticeTitle" placeholder="OKOK" required>
					</div>
        <button type="submit" name="submit" class="btn btn-primary pull-right">Submit</button>
        </form>
    </div>
</div>
</div> </div> 
</body>
</html>