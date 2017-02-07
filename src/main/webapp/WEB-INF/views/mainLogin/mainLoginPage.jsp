<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="kr">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="/resources/login/loginPage.css">
</head>
<body>
<div id="fullscreen_bg" class="fullscreen_bg"/>
<div class="container">
    <form class="form-signin" action="/member/memberLogin" method="post">
        <h1 class="form-signin-heading text-muted">Sign In</h1>
        <input type="text" class="form-control" name="mid" placeholder="Email address" required="" autofocus="">
        <input type="password" class="form-control" name="mpassword" placeholder="Password" required="">
        <button class="signInBtn btn-lg btn-success btn-block" type="submit">
            로그인
        </button>
        <button class="kakaoBtn btn-lg  btn-block" type="submit">
            카카오 로그인
        </button>
        <button class="faceBookBtn btn-lg btn-primary btn-block" type="submit">
            페이스북 로그인
        </button>
        <button class="joinBtn btn-lg btn-block" type="submit" href="#joinModal" data-toggle="modal" title="Compose">
            회원가입
        </button>
    </form>
</div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</html>

<!--모달 테스트 -->
<div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="joinModal" class="modal fade"
     style="display: none;">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button aria-hidden="true" data-dismiss="modal" class="close" type="button">×</button>
                <h4 class="modal-title">회원가입</h4>
            </div>
            <div class="modal-body">
                <form role="form" class="form-horizontal" action="/member/insertMember" method="post">
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Email</label>
                        <div class="col-lg-10">
                            <input type="text" placeholder="이메일을 입력해주세요" name="mid" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Password</label>
                        <div class="col-lg-10">
                            <input type="text" placeholder="비밀번호를 입력해주세요" name="mpassword"
                                   class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Name</label>
                        <div class="col-lg-10">
                            <input type="text" placeholder="이름을 입력해주세요" name="mname" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-lg-offset-2 col-lg-10">
                            <button class="btn btn-send" type="submit">Send</button>
                        </div>
                    </div>
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->