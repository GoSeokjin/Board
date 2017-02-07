<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	
</script>
</head>
<body>
<body>
	<div class="container" style="width: 100%">
		<div class="row">
			<div class="col-md-12">
				<h4>게시판</h4>
				<div class="table-responsive">
					<table id="mytable" class="table table-bordred table-striped">
						<thead>
							<th></th>
							<th>글번호</th>
							<th>작성자</th>
							<th>제목</th>
							<th>작성일</th>
							<th>조회수</th>
							<th>수정/삭제</th>
						</thead>
						<tbody>
							<c:forEach items="${list}" var="boardVO">
								<tr>
									<td></td>
									<td>${boardVO.bno}</td>
									<td>${boardVO.bwriter}</td>
									<td>${boardVO.btitle}</td>
									<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
											value="${boardVO.bregdate}" /></td>
									<td>${boardVO.bviewcnt}</td>
									<td><p data-placement="top" data-toggle="tooltip"
											title="Edit">
											<a href="/board/boardUpdate?bno=${boardVO.bno}">
												<button class="btn btn-primary btn-xs">
													<span class="glyphicon glyphicon-pencil"></span>
												</button>
											</a>
										</p></td>
									<td><p data-placement="top" data-toggle="tooltip"
											title="Delete">
											<a href="/board/boardDelete?bno=${boardVO.bno}">
												<button class="btn btn-danger btn-xs">
													<span class="glyphicon glyphicon-trash"></span>
												</button>
											</a>
										</p></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>

					<div class="clearfix"></div>
					<ul class="pagination pull-right">
						<li class="disabled"><a href="#"><span
								class="glyphicon glyphicon-chevron-left"></span></a></li>
						<li class="active"><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#"><span
								class="glyphicon glyphicon-chevron-right"></span></a></li>
					</ul>

				</div>

			</div>
		</div>
	</div>

</body>
</body>
</html>