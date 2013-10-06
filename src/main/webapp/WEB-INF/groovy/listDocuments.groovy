import findEditor.Document

if (user) {
    def documents = Document.findAll { author == "${user.email}" }

    request['documents'] = documents
}
forward "index.gtpl"