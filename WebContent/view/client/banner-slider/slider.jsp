<%-- 
    Document   : slider
    Created on : May 5, 2020, 11:56:52 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:url value = "/view/client/assets" var="url"/>
       <section id="aa-slider">
    <div class="aa-slider-area">
      <div id="sequence" class="seq">
        <div class="seq-screen">
          <ul class="seq-canvas">
            <!-- single slide item -->
            <li>
              <div class="seq-model">
                <img data-seq src="${url}/images/slide_1.png" alt="Men slide img" />
              </div>
              <div class="seq-title">
               <span data-seq>Giảm giá lên đến 50%</span>                
                <h2 data-seq>Các Loại Hoa Sinh Nhật</h2>                
                <p data-seq>Các loại hoa tại của hàng luôn luôn được tuyển chọn,và các mặt hàng luôn đảm bảo chất lượng.</p>
                <a data-seq href="${pageContext.request.contextPath}/ProductListClientController1" class="aa-shop-now-btn aa-secondary-btn">Xem Sản Phẩm</a>
              </div>
            </li>
            <!-- single slide item -->
            <li>
              <div class="seq-model">
                <img data-seq src="${url}/images/slide_2.jpg" alt="Wristwatch slide img" />
              </div>
              <div class="seq-title">
                <span data-seq>Giảm giá lên đến 20%</span>                
                <h2 data-seq>Cac Loai hoa Khai Trương </h2>                
                <p data-seq>Các loại Hoa khai trương mang màu sắc sang trọng, tinh tế cùng thiết kế mới lạ để chúc mừng khai trương công ty</p>
                <a data-seq href="${pageContext.request.contextPath}/ProductListClientController1" class="aa-shop-now-btn aa-secondary-btn">Xem Sản Phẩm</a>
              </div>
            </li>
            <!-- single slide item -->
            <li>
              <div class="seq-model">
                <img data-seq src="${url}/images/slide_3.png" alt="Women Jeans slide img" />
              </div>
              <div class="seq-title">
                <span data-seq>Giảm giá lên đến 33%</span>                
                <h2 data-seq>Các Hoa Tình Yêu</h2>                
                <p data-seq>Hoa Tình Yêu đều mang một phong thái khác nhau, hãy lựa chọn cho mình một bó hoa tình yêu phù hợp và ưng ý để người ấy luôn mỉm cười và hạnh phúc</p>
                <a data-seq href="${pageContext.request.contextPath}/ProductListClientController1" class="aa-shop-now-btn aa-secondary-btn">Xem Sản Phẩm</a>
              </div>
            </li>
            <!-- single slide item -->           
            <li>
              <div class="seq-model">
                <img data-seq src="${url}/images/slide_4.png" alt="Shoes slide img" />
              </div>
              <div class="seq-title">
                <span data-seq>Giảm giá lên đến 25%</span>                
                <h2 data-seq>Các loại hoa kỹ niệm</h2>                
                <p data-seq>Mẫu hoa được tạo nên từ các loại hoa mang biểu tượng của tình yêu và hạnh phúc, thích hợp trang trí và làm quà tặng cho các dịp lễ kỷ niệm</p>
                <a data-seq href="${pageContext.request.contextPath}/ProductListClientController1" class="aa-shop-now-btn aa-secondary-btn">Xem Sản Phẩm</a>
              </div>
            </li>                   
          </ul>
        </div>
        <!-- slider navigation btn -->
        <fieldset class="seq-nav" aria-controls="sequence" aria-label="Slider buttons">
          <a type="button" class="seq-prev" aria-label="Previous"><span class="fa fa-angle-left"></span></a>
          <a type="button" class="seq-next" aria-label="Next"><span class="fa fa-angle-right"></span></a>
        </fieldset>
      </div>
    </div>
  </section>
