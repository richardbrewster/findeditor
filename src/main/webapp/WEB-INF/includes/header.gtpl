<html>
<head>
    <title>Find Editor Prototype</title>


    <link rel="shortcut icon" href="/images/favicon.png" type="image/png">
    <link rel="icon" href="/images/favicon.png" type="image/png">

    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/css/main.css"/>

</head>

<body>

<!-- Begin Wrapper -->
<div id="wrapper" class="container">

    <!-- Begin Header -->
    <div id="header">

        <H1>Find Editor</H1>

    </div>
    <!-- End Header -->

    <!-- Begin Faux Columns -->
    <div id="faux">

        <!-- Begin Left Column -->
        <div id="leftcolumn">

            <p class="log">
                <% if (user) { %>
                <A href="${users.createLogoutURL("/")}">Logout</A>
                <% } %>
            </p>

        </div>
        <!-- End Left Column -->

        <!-- Begin Right Column -->
        <div id="rightcolumn">
