<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Karmo - Responsive Creative HTML Template</title>
	<!-- META TAGS -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
	<meta name="author" content="Tanislav Robert">
	<meta name="description" content="KARMO is a creative and modern template for digital agencies">

	<!-- STYLES -->
	<link rel="stylesheet" href="assets/css/bootstrap.min.css">
	<link rel="stylesheet" href="assets/css/flexslider.css">
	<link rel="stylesheet" href="assets/css/animsition.min.css">
	<link rel="stylesheet" href="assets/css/style.css">
	<link rel="stylesheet" href="assets/css/owl.carousel.css">
	<link rel="stylesheet" href="assets/css/owl.theme.css">

	<!-- Fontawesome -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
	<link rel="stylesheet" href="https://cdn.linearicons.com/free/1.0.0/icon-font.min.css">
</head>

<body class="animsition">
	<!-- Border -->
	<span class="frame-line top-frame visible-lg"></span>
	<span class="frame-line right-frame visible-lg"></span>
	<span class="frame-line bottom-frame visible-lg"></span>
	<span class="frame-line left-frame visible-lg"></span>
	<!-- HEADER  -->
	<header class="main-header">
		<div class="container-fluid">
				<!-- box header -->
				<div class="box-header">
						<div class="box-logo">
								<a href="index.html"><img src="assets/img/LOGO.png" width="80" alt="Logo"></a>
						</div>
						<!-- box-nav -->
						<a class="box-primary-nav-trigger" href="#0">
								<span class="box-menu-icon"></span>
						</a>
						<!-- box-primary-nav-trigger -->
				</div>
				<!-- end box header -->

				<!-- nav -->
				<nav>
						<ul class="box-primary-nav">
								<li class="box-label">About me</li>

								<li><a href="Pmain">Home</a> <i class="ion-ios-circle-filled color"></i></li>
								<li><a href="revise" method="get">MYSELF</a></li>
								<li><a href="traveldetail" method="get">MYTRAVEL</a></li>
								<li><a href="wallet">WALLET</a></li>
								<li><a href="driverorder">ITINERARY</a></li>

								<li class="box-label"><a href="userlogin">Exit</a></li>

								
						</ul>
				</nav>
				<!-- end nav -->
		</div>
	</header>

	<!-- HERO SECTION  -->
	<div class="site-hero-contact">
		<div class="section-overlay"></div>
		<div class="page-title">
			
			<div class="small-title">home</div>
		</div>
	</div>

	<section class="contact_brick">
	
		<div class="container mt-100">
			
            
            <div class="contact-form bottom">
                <form id="main-contact-form" name="contact-form" method="post" action="inputrevise">
                <div class="col-md-6 col-sm-6 col-xs-12">
                    <div class="form-group">
                        <input type="text" name="nickname" id="name" class="form-control" required="required" placeholder="昵称" value="${user.nickname }">
                    </div>
                    <div class="form-group">
                        <input type="text" name="name" id="name" class="form-control" required="required" placeholder="姓名" value="${user.name }">
                    </div>
                </div>
                <div class="col-md-6 col-sm-6 col-xs-12">
                    <div class="form-group">
                        <input type="text" name="tel" id="name" class="form-control" required="required" placeholder="手机号" value="${user.tel }">
                    </div>
                    <div class="form-group">
                        <input type="text" name="age" id="name" class="form-control" required="required" placeholder="年龄" value="${user.age }">
                    </div>
                    <div class="form-group">
                        <input type="text" name="ps" id="name" class="form-control" required="required" placeholder="个性签名" value="${user.ps }">
                    </div>
                    <div class="form-group">
                        <input type="text" name="professional" id="name" class="form-control" required="required" placeholder="职业" value="${user.professional }">
                    </div>
                    <div class="form-group">
                        <button id="submit_btn" type="submit" class="default-btn gray-btn"> 保存修改<i class="fa fa-angle-double-right" aria-hidden="true"></i></button>
                    </div>
                </div>
                </form>
            </div>
		</div><!-- end container -->
	</section>

	<!-- Footer -->
	<footer class="main-footer">
		<svg preserveAspectRatio="none" viewBox="0 0 100 102" height="100" width="100%" version="1.1" xmlns="http://www.w3.org/2000/svg">
			<path d="M0 0 L50 100 L100 0 Z" fill="#fff" stroke="#fff"></path>
		</svg>
            <div class="container">
                

                <!-- Start Copyright -->
                <div class="copyright-section">
                    <div class="row">
                        <div class="col-md-6">
                            <p>Copyright &copy; 2017.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/"></a></p>
                        </div><!-- .col-md-6 -->
                    </div><!-- .row -->
                </div>
                <!-- End Copyright -->
            </div>
	</footer>

	<!-- SCRIPTS -->
	<script type="text/javascript" src="assets/js/jquery-2.2.3.min.js"></script>
	<script type="text/javascript" src="assets/js/animated-headline.js"></script>
	<script type="text/javascript" src="assets/js/menu.js"></script>
	<script type="text/javascript" src="assets/js/modernizr.js"></script>
	<script type="text/javascript" src="assets/js/isotope.pkgd.min.js"></script>
	<script type="text/javascript" src="assets/js/jquery.flexslider-min.js"></script>
	<script type="text/javascript" src="assets/js/jquery.animsition.min.js"></script>
	<script type="text/javascript" src="assets/js/init.js"></script>
	<script type="text/javascript" src="assets/js/main.js"></script>
	<script type="text/javascript" src="assets/js/smooth-scroll.js"></script>
	<script type="text/javascript" src="assets/js/numscroller.js"></script>
	<script type="text/javascript" src="assets/js/wow.min.js"></script>
	<script type="text/javascript" src="assets/js/owl.carousel.min.js"></script>

	<script type="text/javascript">
		$(window).load(function() {
			new WOW().init();

			// initialise flexslider
			$('.flexslider').flexslider({
				animation: "fade",
				directionNav: true,
				controlNav: false,
				keyboardNav: true,
				slideToStart: 0,
				animationLoop: true,
				pauseOnHover: false,
				slideshowSpeed: 4000,
			});

			smoothScroll.init();

			// initialize isotope
			var $container = $('.portfolio_container');
			$container.isotope({
				filter: '*',
			});

			$('.portfolio_filter a').click(function(){
				$('.portfolio_filter .active').removeClass('active');
				$(this).addClass('active');

				var selector = $(this).attr('data-filter');
				$container.isotope({
					filter: selector,
					animationOptions: {
						duration: 500,
						animationEngine : "jquery"
					}
				});
				return false;
			});
		});
	</script>
</body>
</html>
