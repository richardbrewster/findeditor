import com.google.appengine.api.blobstore.BlobKey

BlobKey blob = new BlobKey(request.getParameter("blobKey"))

response.setHeader "Content-disposition", "attachment;filename=${blob.filename}"
response['contentType'] = blob.contentType

// serve the whole blob
blob.serve response