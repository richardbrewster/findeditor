<% include '/WEB-INF/includes/header.gtpl' %>

<% if (user) { %>

<h1>My Documents</h1>

<table width="50%" border="1">
    <tr>
        <th width="30%">Document</th>
        <th>Size</th>
        <th>Author ID</th>
        <th>Author Email</th>
        <th>Type</th>
        <th>Subject</th>
    </tr>
    <% request.documents.each { document -> %>
    <tr>
        <td>${document.fileName}</td>
        <td>${document.fileSize}</td>
        <td align="left">${document.authorId}</td>
        <td align="left">${document.authorEmail}</td>
        <td align="left">${document.docType}</td>
        <td align="left">${document.subjectMatter}</td>
        <td><A href="downloadBlob.groovy?blobKey=${document.blobKey}">Download</A>
        <td><A href="deleteDocument.groovy?id=${document.id}">Delete</A></td>
    </tr>
    <% } %>
</table>


<div class="add">
    <p>
        <A href="/upload"><h1>Upload a document</h1></A>
    </p>
</div>

<% } else { %>
<p><A href="${users.createLoginURL("/")}">Login</A></p>
<% } %>


<% include '/WEB-INF/includes/footer.gtpl' %>

