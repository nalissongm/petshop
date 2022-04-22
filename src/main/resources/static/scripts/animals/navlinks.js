const url = location.pathname;

const linkHref = document.querySelectorAll("header nav li a");

linkHref.forEach((link) => {
  if (url.startsWith(String(link.getAttribute("href")))) {
    link.classList.add("active");
    return;
  }


  link.classList.remove("active");
});
