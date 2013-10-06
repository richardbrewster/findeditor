
get "/", redirect: "listDocuments.groovy"
get "/favicon.ico", redirect: "/images/favicon.png"

get "/upload",  forward: "/upload.gtpl"
get "/success", forward: "/success.gtpl"
get "/failure", forward: "/failure.gtpl"