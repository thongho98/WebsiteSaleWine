$(document).ready(function() {
  // $(".owl-carousel").owlCarousel();
  var owl = $(".owl-carousel");
  owl.owlCarousel({
    loop: true,
    margin: 10,
    autoplay:true,
    autoplayTimeout: 3000,
    responsive: {
      0: {
        items: 1
      },
      600: {
        items: 2
      },
      960: {
        items: 2
      },
      1200: {
        items: 3
      }
    }
  });
  owl.on("mousewheel", ".owl-stage", function(e) {
    if (e.deltaY > 0) {
      owl.trigger("next.owl");
    } else {
      owl.trigger("prev.owl");
    }
    e.preventDefault();
  });
});
