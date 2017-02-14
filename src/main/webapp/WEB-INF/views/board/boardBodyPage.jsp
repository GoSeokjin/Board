<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
									<td><a href="/board/boardRead?bno=${boardVO.bno}">${boardVO.bwriter}</a></td>
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
						<c:if test="${pageMaker.prev}">
							<li class="">
							<a href="boardMain?page=${pageMaker.startPage-1}">
							이전
							</a>
							</li>
						</c:if>
						<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
							<li <c:out value="${pageMaker.cri.page ==idx?'class=active':' '}"/>>
								<a href="boardMain?page=${idx}">${idx}</a>
							</li>
						</c:forEach>
						<c:if test="${pageMaker.next&&pageMaker.endPage>0}">
							<li>
							<a href="boardMain?page=${pageMaker.endPage+1}">
							다음
							</a>
							</li>
						</c:if>
					</ul>
		<%-- 			<div class="box-body">
					<select name = "searchType">
					<option value="n" <c:out value="${pageMaker.serachType == null?'selected':''}"}"/>>---</option>
					<option value="t" <c:out value="${pageMaker.serachType eq 't'?'selected':''}"}"/>>Title</option>
					<option value="c" <c:out value="${pageMaker.serachType eq 'c'?'selected':''}"}"/>>Content</option>
					<option value="w" <c:out value="${pageMaker.serachType eq 'w'?'selected':''}"}"/>>Writer</option>
					<option value="tc" <c:out value="${pageMaker.serachType eq 'tc'?'selected':''}"}"/>>Title or Content</option>
					<option value="cw" <c:out value="${pageMaker.serachType eq 'cw'?'selected':''}"}"/>>Content or Writer</option>
					<option value="tcw" <c:out value="${pageMaker.serachType eq 'tcw'?'selected':''}"}"/>>ALL</option>
					</select>
					<input type="text" name="keyword" id="keywordInput" value='${pageMaker.keyword}'>
					<button id='searchBtn'>Search</button>
					<button id='newBtn'>New Board</button>
					</div> --%>
				</div>
			</div>
		</div>
	</div>

</body>
</body>
</html>