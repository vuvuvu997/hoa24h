<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:url value = "/view/client/assets" var="url"/>
        <!-- jQuery library -->
        
   <!--Start of Tawk.to Script-->
	<script type="text/javascript">
	var Tawk_API=Tawk_API||{}, Tawk_LoadStart=new Date();
	(function(){
	var s1=document.createElement("script"),s0=document.getElementsByTagName("script")[0];
	s1.async=true;
	s1.src='https://embed.tawk.to/5eedbd889e5f69442290f4d1/default';
	s1.charset='UTF-8';
	s1.setAttribute('crossorigin','*');
	s0.parentNode.insertBefore(s1,s0);
	})();
	</script>
<!--End of Tawk.to Script-->

<!-- Load Facebook SDK for JavaScript -->
      <div id="fb-root"></div>
      <script>
        window.fbAsyncInit = function() {
          FB.init({
            xfbml            : true,
            version          : 'v8.0'
          });
        };

        (function(d, s, id) {
        var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) return;
        js = d.createElement(s); js.id = id;
        js.src = 'https://connect.facebook.net/vi_VN/sdk/xfbml.customerchat.js';
        fjs.parentNode.insertBefore(js, fjs);
      }(document, 'script', 'facebook-jssdk'));</script>

      <!-- Your Chat Plugin code -->
      <div class="fb-customerchat"
        attribution=setup_tool
        page_id="114258073815701"
  theme_color="#d696bb"
  logged_in_greeting="Xin chào! Mình giúp gì được cho bạn nào :v"
  logged_out_greeting="Xin chào! Mình giúp gì được cho bạn nào :v">
      </div>
      
      
      
      



<div id="fb-root"></div>
<script async defer crossorigin="anonymous" 
src="https://connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v8.0&appId=895975887577576&autoLogAppEvents=1" nonce="zD2PT2AQ">
</script>

<div id="fb-root"></div>
<script async defer crossorigin="anonymous" 
src="https://connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v8.0&appId=895975887
577576&autoLogAppEvents=1" nonce="B1qgbk7T"></script>


<div id="fb-root"></div>
<script async defer crossorigin="anonymous" 
src="https://connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v8.0&appId=895975887577576&autoLogAppEvents=1" 
nonce="X70YX9P6"></script>


  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <!-- Include all compiled plugins (below), or include individual files as needed -->
  <script src="${url}/js/bootstrap.js"></script>  
  <!-- SmartMenus jQuery plugin -->
  <!-- SmartMenus jQuery Bootstrap Addon -->

  <!-- To Slider JS -->
  <script src="${url}/js/sequence.js"></script>
  <script src="${url}/js/sequence-theme.modern-slide-in.js"></script>  
  <!-- Product view slider -->
  <script type="text/javascript" src="${url}/js/jquery.simpleGallery.js"></script>
  <script type="text/javascript" src="${url}/js/jquery.simpleLens.js"></script>
  <!-- slick slider -->
  <script type="text/javascript" src="${url}/js/slick.js"></script>
  <!-- Price picker slider -->
  <script type="text/javascript" src="${url}/js/nouislider.js"></script>
  <script type="text/javascript" src="${url}/js/validate.js"></script>
  <!-- Custom js -->
  <script type="text/javascript" src="${url}/js/custom.js"></script> 
