import com.google.appengine.api.blobstore.BlobKey

BlobKey blob = new BlobKey(request.getParameter("blobKey"))

// Handle spaces and other characters in file name.
def encodedName = URLEncoder.encode(blob.filename, 'UTF-8')

response.setHeader "Content-disposition", "attachment;filename=${encodedName}"
response['contentType'] = blob.contentType

// serve the whole blob
blob.serve response