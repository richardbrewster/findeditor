package findEditor

import groovyx.gaelyk.datastore.Entity
import groovyx.gaelyk.datastore.Indexed
import groovyx.gaelyk.datastore.Key
import groovyx.gaelyk.datastore.Unindexed

/**
 *
 */
@Entity(unindexed = false)
class Document {
    @Key long id
    @Indexed String authorId // User ID of author
    @Indexed String authorEmail // Email of author
    @Indexed String docType
    @Indexed String blobKey
    @Unindexed int wordCount
    @Unindexed String subjectMatter
    @Unindexed String fileName
    @Unindexed int fileSize
    @Unindexed Date neededBy

}
