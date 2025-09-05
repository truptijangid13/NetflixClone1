<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Select Your Profile</title>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@600;700&display=swap" rel="stylesheet">

    <style>
        body {
            background-image: url('Selectback5.jpg');
            background-size: cover;
            background-position: center;

  background-color: #000;

            color: white;
            font-family: Arial, sans-serif;
            text-align: center;
            padding-top: 50px;
        }
        h1 {
            font-size: 2.5rem;
            margin-bottom: 30px;
        }

        .profiles {
    display: flex;
    justify-content: center;
    gap: 50px;
    flex-wrap: wrap;
}

.profile {
    cursor: pointer;
    transition: transform 0.3s;
    background: rgba(255, 255, 255, 0.05);
    padding: 20px;
    border-radius: 20px;
    border: none;
    text-align: center;
    width: 200px;
    box-shadow: 0 4px 15px rgba(255, 255, 255, 0.1);
}

.profile:hover {
    transform: scale(1.1);
    box-shadow: 0 6px 20px rgba(255, 255, 255, 0.25);
}

.profile img {
    border: 3px solid white;
    border-radius: 15px;
    width: 180px;
    height: 180px;
}

.profile-name {
    margin-top: 15px;
    font-size: 1.5rem; /* bigger text */
    font-weight: 700;  /* bold */
    letter-spacing: 1px;
    text-shadow: 2px 2px 4px rgba(0,0,0,0.5); /* glow/shadow for readability */
    font-family: 'Montserrat', sans-serif; /* or try 'Poppins', 'Raleway', or any cool Google Font */
    color: #fff;
}


    </style>
</head>
<body>

<h1>Who's watching?</h1>
<br>
<br>
<div class="profiles">
    <form action="video.html" method="post">
        <button type="submit" name="profile" value="Bloom" class="profile">
            <img src="VAIBHU.jpeg" alt="Bloom">
            <div class="profile-name">Bloom</div>
        </button>
    </form>

    <form action="video.html" method="post">
        <button type="submit" name="profile" value="Halo" class="profile">
            <img src="BHAVI.jpeg" alt="Halo">
            <div class="profile-name">Halo</div>
        </button>
    </form>

    <form action="video.html" method="post">
         <button type="submit" name="profile" value="Drift" class="profile">
             <img src="SHITAL.jpeg" alt="Drift">
             <div class="profile-name">Drift</div>
         </button>
     </form>

    <form action="video.html" method="post">
        <button type="submit" name="profile" value="Daze" class="profile">
            <img src="RUTU.jpeg" alt="daze">
            <div class="profile-name">Daze</div>
        </button>
    </form>


    <form action="video.html" method="post">
        <button type="submit" name="profile" value="Floret" class="profile">
            <img src="TRUPS2.jpeg" alt="Floret">
            <div class="profile-name">Floret</div>
        </button>
    </form>
</div>

</body>
</html>
