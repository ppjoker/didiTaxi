<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<title></title>
	<!-- META TAGS -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
	<meta name="author" content="Tanislav Robert">
	<meta name="description" content="KARMO is a creative and modern template for digital agencies">
	<style type="text/css">
	   @import
	   url("<c:url value="/assets/css/bootstrap.min.css"/>");
	   url("<c:url value="/assets/css/flexslider.css"/>");
	   url("<c:url value="/assets/css/animsition.min.css"/>");
	   url("<c:url value="/assets/css/style.css"/>");
	   url("<c:url value="/assets/css/owl.carousel.css"/>");
	url("<c:url value="/assets/css/owl.theme.css"/>");
	url("<c:url value="/assets/js/jquery-2.2.3.min.js"/>");
	url("<c:url value="/assets/js/animated-headline.js"/>");
	url("<c:url value="/assets/js/menu.js"/>");
	url("<c:url value="/assets/js/modernizr.js"/>");
	url("<c:url value="/assets/js/isotope.pkgd.min.js"/>");
	url("<c:url value="/assets/js/jquery.flexslider-min.js"/>");
	url("<c:url value="/assets/js/jquery.animsition.min.js"/>");
	url("<c:url value="/assets/js/init.js"/>");
	url("<c:url value="/assets/js/main.js"/>");
	url("<c:url value="/assets/js/smooth-scroll.js"/>");
	url("<c:url value="/assets/js/wow.min.js"/>");
	url("<c:url value="/assets/js/owl.carousel.min.js"/>");
	
	 </style>
	<!-- STYLES -->
	<link rel="stylesheet" href="assets/css/bootstrap.min.css">
	<link rel="stylesheet" href="assets/css/flexslider.css">
	<link rel="stylesheet" href="assets/css/animsition.min.css">
	<link rel="stylesheet" href="assets/css/style.css">
	<link rel="stylesheet" href="assets/css/owl.carousel.css">
	<link rel="stylesheet" href="assets/css/owl.theme.css">

	
</head>

<body class="animsition">

	<!-- HEADER  -->
	<header class="main-header">
		<div class="container-fluid">
				<!-- box header -->
				<div class="box-header">
						<div class="box-logo">
								<a href="main"><img src="assets/img/LOGO.png" width="80" alt="Logo"></a>
						</div>
						<!-- box-nav -->
						
						<!-- box-primary-nav-trigger -->
				</div>
				<!-- end box header -->

				<!-- nav -->
				
				<!-- end nav -->

				<!-- box-intro -->
				<section class="box-intro bg-film">
						<div class="table-cell">

								<h3 class="box-headline letters rotate-2">
										<span class="box-words-wrapper">
												<b class="is-visible">CLEAN &nbsp;&amp;&nbsp; CREATIVE.</b>
												<b>&nbsp;SIMPLE &nbsp;&amp;&nbsp; POWERFUL.</b>
										</span>
								</h3>
								<h1>WE ARE KARMO</h1>

						</div>

						<div class="mouse">
								<div class="scroll"></div>
						</div>
				</section>
				<!-- end box-intro -->
		</div>
	</header>

	<!-- HISTORY OF AGENCY -->
	<section id="about" class="about mt-150 mb-50">
		<div class="container">
			<div class="row center">
				<div class="col-md-8 col-md-offset-2">
					<img src="assets/img/about.png" alt="Khaki HTML Template" width="300">
					<div class="km-space"></div>
					<h5 class="lead">This is our most powerful template, that provide functionality to create corporate, app showcase, gaming, music, barber, etc websites.</h5>
				</div>
			</div><!-- description text -->
		</div>
	</section>

	<!-- FACTS  -->
	

	<!-- TEAM -->
	
	

	

	
	

	
	<!-- Footer -->
	<footer class="main-footer">
		<svg preserveAspectRatio="none" viewBox="0 0 100 102" height="100" width="100%" version="1.1" xmlns="http://www.w3.org/2000/svg" class="svgcolor-light">
			<path d="M0 0 L50 100 L100 0 Z" fill="#fff" stroke="#fff"></path>
		</svg>
            <div class="container">
                
                        

                <!-- Start Copyright -->
                <div class="copyright-section">
                    <div class="row">
                        <div class="col-md-6">
                            <p>Copyright &copy; 2017.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
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
