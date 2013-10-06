import findEditor.Document

if (user) {

    // TODO: Filter by user.
    def documents = Document.findAll()

    request['documents'] = documents
}
forward "index.gtpl"