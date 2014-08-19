goog.addDependency("base.js", ['goog'], []);
goog.addDependency("../cljs/core.js", ['cljs.core'], ['goog.string', 'goog.object', 'goog.string.StringBuffer', 'goog.array']);
goog.addDependency("../clojure/string.js", ['clojure.string'], ['goog.string', 'cljs.core', 'goog.string.StringBuffer']);
goog.addDependency("../cljs/reader.js", ['cljs.reader'], ['goog.string', 'cljs.core', 'goog.string.StringBuffer']);
goog.addDependency("../ajax/core.js", ['ajax.core'], ['goog.net.XhrManager', 'goog.net.XhrIo', 'goog.Uri.QueryData', 'goog.Uri', 'cljs.core', 'goog.net.EventType', 'goog.structs', 'goog.json.Serializer', 'clojure.string', 'cljs.reader', 'goog.events', 'goog.net.ErrorCode']);
goog.addDependency("../ephemeral_client/request.js", ['ephemeral_client.request'], ['ajax.core', 'cljs.core']);
goog.addDependency("../ephemeral_client/core.js", ['ephemeral_client.core'], ['cljs.core', 'ephemeral_client.request']);