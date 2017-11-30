<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="s" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Home</title>

<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>

<!-- Bootstrap -->
<link rel="stylesheet" href="${s}/css/bootstrap.min.css">

<!-- Font Awesome -->
<link rel="stylesheet" href="${s}/css/font-awesome.min.css">

<!-- Custom CSS -->
<link rel="stylesheet" href="${s}/css/owl.carousel.css">
<link rel="stylesheet" href="${s}/style.css">
<link rel="stylesheet" href="${s}/css/responsive.css">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->
</head>
<body>
<div class="header-area">
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<div class="user-menu">
					<ul>
						<li><a href="#"><i class="fa fa-user"></i> My Account</a></li>
						<li><a href="#"><i class="fa fa-heart"></i> Wishlist</a></li>
						<li><a href="${s}/cart.jsp"><i class="fa fa-user"></i> My Cart</a></li>
						<li><a href="#"><i class="fa fa-user"></i> Login</a></li>
					</ul>
				</div>
			</div>
			
			<div class="col-md-4">
				<div class="header-right">
					<ul class="list-unstyled list-inline">
						<li class="dropdown dropdown-small">
							<a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" href="#"><span class="key">currency :</span><span class="value">USD </span><b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">USD</a></li>
								<li><a href="#">INR</a></li>
								<li><a href="#">GBP</a></li>
							</ul>
						</li>

						<li class="dropdown dropdown-small">
							<a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" href="#"><span class="key">language :</span><span class="value">English </span><b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">English</a></li>
								<li><a href="#">French</a></li>
								<li><a href="#">German</a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div> <!-- End header area -->

<div class="site-branding-area">
	<div class="container">
		<div class="row">
			<div class="col-sm-6">
				<div class="logo">
					<h1><a href="${s}/index.jsp">e<span>Electronics</span></a></h1>
				</div>
			</div>
			
			<div class="col-sm-6">
				<div class="shopping-item">
					<a href="${s}/showCart">Cart - <span class="cart-amunt">$${totalPrice }</span> <i class="fa fa-shopping-cart"></i> <span class="product-count">${quantity }</span></a>
				</div>
			</div>
		</div>
	</div>
</div> <!-- End site branding area -->

<div class="mainmenu-area">
	<div class="container">
		<div class="row">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div> 
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="${s}/index.jsp">Home</a></li>
					<li><a href="${s}/product/pageDivide?num=1">Shop page</a></li>
					<li><a href="${s}/single-product.jsp">Single product</a></li>
					<li><a href="${s}/showCart">Cart</a></li>
					<li><a href="#">Category</a></li>
					<li><a href="#">Others</a></li>
					<li><a href="#">Contact</a></li>
				</ul>
			</div>  
		</div>
	</div>
</div> <!-- End mainmenu area -->

<div class="slider-area">
	<div class="zigzag-bottom"></div>
	<div id="slide-list" class="carousel carousel-fade slide" data-ride="carousel">
		<div class="slide-bulletz">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<ol class="carousel-indicators slide-indicators">
							<li data-target="#slide-list" data-slide-to="0" class="active"></li>
							<li data-target="#slide-list" data-slide-to="1"></li>
							<li data-target="#slide-list" data-slide-to="2"></li>
						</ol>                            
					</div>
				</div>
			</div>
		</div>

		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<div class="single-slide">
					<div class="slide-bg slide-one"></div>
					<div class="slide-text-wrapper">
						<div class="slide-text">
							<div class="container">
								<div class="row">
									<div class="col-md-6 col-md-offset-6">
										<div class="slide-content">
											<h2>We are awesome</h2>
											<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur, dolorem, excepturi. Dolore aliquam quibusdam ut quae iure vero exercitationem ratione!</p>
											<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Modi ab molestiae minus reiciendis! Pariatur ab rerum, sapiente ex nostrum laudantium.</p>
											<a href="" class="readmore">Learn more</a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="item">
				<div class="single-slide">
					<div class="slide-bg slide-two"></div>
					<div class="slide-text-wrapper">
						<div class="slide-text">
							<div class="container">
								<div class="row">
									<div class="col-md-6 col-md-offset-6">
										<div class="slide-content">
											<h2>We are great</h2>
											<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Saepe aspernatur, dolorum harum molestias tempora deserunt voluptas possimus quos eveniet, vitae voluptatem accusantium atque deleniti inventore. Enim quam placeat expedita! Quibusdam!</p>
											<a href="" class="readmore">Learn more</a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="item">
				<div class="single-slide">
					<div class="slide-bg slide-three"></div>
					<div class="slide-text-wrapper">
						<div class="slide-text">
							<div class="container">
								<div class="row">
									<div class="col-md-6 col-md-offset-6">
										<div class="slide-content">
											<h2>We are superb</h2>
											<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores, eius?</p>
											<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Deleniti voluptates necessitatibus dicta recusandae quae amet nobis sapiente explicabo voluptatibus rerum nihil quas saepe, tempore error odio quam obcaecati suscipit sequi.</p>
											<a href="" class="readmore">Learn more</a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>        
</div> <!-- End slider area -->

<div class="promo-area">
	<div class="zigzag-bottom"></div>
	<div class="container">
		<div class="row">
			<div class="col-md-3 col-sm-6">
				<div class="single-promo">
					<i class="fa fa-refresh"></i>
					<p>30 Days return</p>
				</div>
			</div>
			<div class="col-md-3 col-sm-6">
				<div class="single-promo">
					<i class="fa fa-truck"></i>
					<p>Free shipping</p>
				</div>
			</div>
			<div class="col-md-3 col-sm-6">
				<div class="single-promo">
					<i class="fa fa-lock"></i>
					<p>Secure payments</p>
				</div>
			</div>
			<div class="col-md-3 col-sm-6">
				<div class="single-promo">
					<i class="fa fa-gift"></i>
					<p>New products</p>
				</div>
			</div>
		</div>
	</div>
</div> <!-- End promo area -->

<div class="maincontent-area">
	<div class="zigzag-bottom"></div>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="latest-product">
					<h2 class="section-title">Latest Products</h2>
					<div class="product-carousel">
					<c:forEach items="${latestList }" var="asd">
						<div class="single-product">
							<div class="product-f-image">
								<img src="${s}/${asd.img1}" alt="">
								<div class="product-hover">
									<a href="${s}/addTocartT?productname=${asd.name}" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> Add to cart</a>
									<a href="${s}/product/findByName?name=${asd.name}" class="view-details-link"><i class="fa fa-link"></i> See details</a>
								</div>
							</div>
							
							<h2><a href="${s}/product/findByName?name=${asd.name}">${asd.name}</a></h2>
							
							<div class="product-carousel-price">
								<ins>$${asd.discount}</ins> <del>$${asd.price}</del>
							</div> 
						</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
</div> <!-- End main content area -->

<div class="brands-area">
	<div class="zigzag-bottom"></div>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="brand-wrapper">
					<h2 class="section-title">Brands</h2>
					<div class="brand-list">
						<img src="${s}/img/services_logo__1.jpg" alt="">
						<img src="${s}/img/services_logo__2.jpg" alt="">
						<img src="${s}/img/services_logo__3.jpg" alt="">
						<img src="${s}/img/services_logo__4.jpg" alt="">
						<img src="${s}/img/services_logo__1.jpg" alt="">
						<img src="${s}/img/services_logo__2.jpg" alt="">
						<img src="${s}/img/services_logo__3.jpg" alt="">
						<img src="${s}/img/services_logo__4.jpg" alt="">                            
					</div>
				</div>
			</div>
		</div>
	</div>
</div> <!-- End brands area -->

<div class="product-widget-area">
	<div class="zigzag-bottom"></div>
	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<div class="single-product-widget">
					<h2 class="product-wid-title">Top Sellers</h2>
					<div class="single-wid-product">
						<a href="${s}/single-product.jsp"><img src="${s}/${latestList.get(5).getImg1()}" alt="" class="product-thumb"></a>
						<h2><a href="${s}/single-product.jsp">${latestList.get(5).getName()}</a></h2>
						<div class="product-wid-rating">
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
						</div>
						<div class="product-wid-price">
							<ins>${latestList.get(5).getDiscount()}</ins> <del>${latestList.get(5).getPrice()}</del>
						</div>                            
					</div>
					<div class="single-wid-product">
						<a href="single-product.jsp"><img src="${s}/${latestList.get(4).getImg1()}" alt="" class="product-thumb"></a>
						<h2><a href="${s}/single-product.jsp">${latestList.get(4).getName()}</a></h2>
						<div class="product-wid-rating">
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
						</div>
						<div class="product-wid-price">
							<ins>${latestList.get(4).getDiscount()}</ins> <del>${latestList.get(4).getPrice()}</del>
						</div>                            
					</div>
					<div class="single-wid-product">
						<a href="${s}/single-product.jsp"><img src="${s}/${latestList.get(3).getImg1()}" alt="" class="product-thumb"></a>
						<h2><a href="${s}/single-product.jsp">${latestList.get(3).getName()}</a></h2>
						<div class="product-wid-rating">
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
						</div>
						<div class="product-wid-price">
							<ins>${latestList.get(3).getDiscount()}</ins> <del>${latestList.get(3).getPrice()}</del>
						</div>                            
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="single-product-widget">
					<h2 class="product-wid-title">Best One</h2>
					<div class="single-wid-product">
						<a href="${s}/single-product.jsp"><img src="${s}/${latestList.get(3).getImg1()}" alt="" class="product-thumb"></a>
						<h2><a href="${s}/single-product.jsp">${latestList.get(3).getImg1()}</a></h2>
						<div class="product-wid-rating">
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
						</div>
						<div class="product-wid-price">
							<ins>${latestList.get(3).getDiscount()}</ins> <del>${latestList.get(3).getPrice()}</del>
						</div>                            
					</div>
					<div class="single-wid-product">
						<a href="${s}/single-product.jsp"><img src="${s}/${latestList.get(2).getImg1()}" alt="" class="product-thumb"></a>
						<h2><a href="${s}/single-product.jsp">${latestList.get(2).getName()}</a></h2>
						<div class="product-wid-rating">
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
						</div>
						<div class="product-wid-price">
							<ins>${latestList.get(2).getDiscount()}</ins> <del>${latestList.get(2).getPrice()}</del>
						</div>                            
					</div>
					<div class="single-wid-product">
						<a href="${s}/single-product.jsp"><img src="${s}/${latestList.get(1).getImg1()}" alt="" class="product-thumb"></a>
						<h2><a href="${s}/single-product.jsp">${latestList.get(1).getName()}</a></h2>
						<div class="product-wid-rating">
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
						</div>
						<div class="product-wid-price">
							<ins>${latestList.get(1).getDiscount()}</ins> <del>${latestList.get(1).getPrice()}</del>
						</div>                            
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="single-product-widget">
					<h2 class="product-wid-title">Top New</h2>
					<div class="single-wid-product">
						<a href="${s}/single-product.jsp"><img src="${s}/${latestList.get(0).getImg1()}" alt="" class="product-thumb"></a>
						<h2><a href="${s}/single-product.jsp">${latestList.get(0).getName()}</a></h2>
						<div class="product-wid-rating">
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
						</div>
						<div class="product-wid-price">
							<ins>${latestList.get(0).getDiscount()}</ins> <del>${latestList.get(0).getPrice()}</del>
						</div>                            
					</div>
					<div class="single-wid-product">
						<a href="${s}/single-product.jsp"><img src="${s}/${latestList.get(5).getImg1()}" alt="" class="product-thumb"></a>
						<h2><a href="${s}/single-product.jsp">${latestList.get(3).getName()}</a></h2>
						<div class="product-wid-rating">
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
						</div>
						<div class="product-wid-price">
							<ins>${latestList.get(3).getDiscount()}</ins> <del>${latestList.get(5).getPrice()}</del>
						</div>                            
					</div>
					<div class="single-wid-product">
						<a href="${s}/single-product.jsp"><img src="${s}/${latestList.get(4).getImg1()}" alt="" class="product-thumb"></a>
						<h2><a href="${s}/single-product.jsp">${latestList.get(4).getName()}</a></h2>
						<div class="product-wid-rating">
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
							<i class="fa fa-star"></i>
						</div>
						<div class="product-wid-price">
							<ins>${latestList.get(4).getDiscount()}</ins> <del>${latestList.get(4).getPrice()}</del>
						</div>                            
					</div>
				</div>
			</div>
		</div>
	</div>
</div> <!-- End product widget area -->

<div class="footer-top-area">
	<div class="zigzag-bottom"></div>
	<div class="container">
		<div class="row">
			<div class="col-md-3 col-sm-6">
				<div class="footer-about-us">
					<h2>e<span>Electronics</span></h2>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis sunt id doloribus vero quam laborum quas alias dolores blanditiis iusto consequatur, modi aliquid eveniet eligendi iure eaque ipsam iste, pariatur omnis sint! Suscipit, debitis, quisquam. Laborum commodi veritatis magni at?</p>
					<div class="footer-social">
						<a href="#" target="_blank"><i class="fa fa-facebook"></i></a>
						<a href="#" target="_blank"><i class="fa fa-twitter"></i></a>
						<a href="#" target="_blank"><i class="fa fa-youtube"></i></a>
						<a href="#" target="_blank"><i class="fa fa-linkedin"></i></a>
						<a href="#" target="_blank"><i class="fa fa-pinterest"></i></a>
					</div>
				</div>
			</div>
			
			<div class="col-md-3 col-sm-6">
				<div class="footer-menu">
					<h2 class="footer-wid-title">User Navigation </h2>
					<ul>
						<li><a href="#">My account</a></li>
						<li><a href="#">Order history</a></li>
						<li><a href="#">Wishlist</a></li>
						<li><a href="#">Vendor contact</a></li>
						<li><a href="#">Front page</a></li>
					</ul>                        
				</div>
			</div>		
			<div class="col-md-3 col-sm-6">
                    <div class="footer-menu">
                        <h2 class="footer-wid-title">Categories</h2>
                        <ul>
                            <li><a href="product/Computer?num=1">Computer</a></li>
                            <li><a href="product/Phone?num=1">Phone</a></li>
                            <li><a href="product/Tv?num=1">Tv</a></li>
                            <li><a href="product/Macbook?num=1">Macbook</a></li>
                            <li><a href="product/AirConditoner?num=1">AirConditoner</a></li>
                            <li><a href="product/Playstation?num=1">Playstation</a></li>
                            <li><a href="product/Ipad?num=1">Ipad</a></li>
                        </ul>                        
                    </div>
                </div>
			<div class="col-md-3 col-sm-6">
				<div class="footer-newsletter">
					<h2 class="footer-wid-title">Newsletter</h2>
					<p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>
					<div class="newsletter-form">
						<form action="#">
							<input type="email" placeholder="Type your email">
							<input type="submit" value="Subscribe">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div> <!-- End footer top area -->

<div class="footer-bottom-area">
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<div class="copyright">
					<p>Copyright &copy; 2016.Company name All rights reserved.<a target="_blank" href="http://www.17sucai.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
				</div>
			</div>
			
			<div class="col-md-4">
				<div class="footer-card-icon">
					<i class="fa fa-cc-discover"></i>
					<i class="fa fa-cc-mastercard"></i>
					<i class="fa fa-cc-paypal"></i>
					<i class="fa fa-cc-visa"></i>
				</div>
			</div>
		</div>
	</div>
</div> <!-- End footer bottom area -->

<!-- Latest jQuery form server -->
<script src="${s}/js/jquery-1.8.3.min.js"></script>

<!-- Bootstrap JS form CDN -->
<script src="${s}/js/bootstrap.min.js"></script>

<!-- jQuery sticky menu -->
<script src="${s}/js/owl.carousel.min.js"></script>
<script src="${s}/js/jquery.sticky.js"></script>

<!-- jQuery easing -->
<script src="${s}/js/jquery.easing.1.3.min.js"></script>

<!-- Main Script -->
<script src="${s}/js/main.js"></script>
</body>
</html>