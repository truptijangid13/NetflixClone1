protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession session = request.getSession();
    Integer userId = (Integer) session.getAttribute("userId");

    if (userId == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    WishlistDAO wishlistDAO = new WishlistDAO();
    List<Video> wishlist = wishlistDAO.getWishlist(userId);
    request.setAttribute("wishlist", wishlist);
    request.getRequestDispatcher("wishlist.jsp").forward(request, response);
}
