package findEditor

import groovyx.gaelyk.datastore.Entity
import groovyx.gaelyk.datastore.Key
import groovyx.gaelyk.datastore.Unindexed

/**
 *
 */
@Entity(unindexed = false)
class Document {
    @Key long id
    String author // login
    String docType
    String blobKey
    @Unindexed int wordCount
    @Unindexed String subjectMatter
    @Unindexed String fileName
    @Unindexed int fileSize
    @Unindexed Date neededBy

}
