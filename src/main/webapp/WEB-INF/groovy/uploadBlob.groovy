import findEditor.Document

def blobs = blobstore.getUploadedBlobs(request)
def blob = blobs["myTextFile"]

response.status = 302

if (blob) {
    //  Persist a Document referencing the file.
    String blobKey = "${blob.keyString}"

    log.fine("blobKey: $blobKey")

    Document document = new Document(
            wordCount: 0,
            subjectMatter: 'Test Subject',
            docType: "Test Doc type",
            authorId: "${user.userId}",
            authorEmail: "${user.email}",
            fileName: "${blob.filename}",
            fileSize: blob.size,
            blobKey: blobKey)

    document.save()

    redirect "/success?key=${blobKey}"
} else {
    redirect "/failure"
}