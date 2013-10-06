import findEditor.Document

long id = Long.parseLong(request.getParameter("id"))


def document = Document.get(id)

document.delete()

forward "listDocuments.groovy"