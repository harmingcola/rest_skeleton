package skeleton.acceptance.steps

import org.apache.http.client.HttpClient
import org.apache.http.impl.client.HttpClients


class BaseStep {

    private static final String DEFAULT_SERVER_URL = 'http://localhost:8080/'

    private static String serverUrl = null

    protected HttpClient httpClient = HttpClients.createDefault()

    static String serverUrl() {
        if (serverUrl == null) {
            String envServerUrl = System.getProperty("server.url")
            if (envServerUrl != '') {
                serverUrl = envServerUrl
                return serverUrl
            } else {
                serverUrl = DEFAULT_SERVER_URL

            }
        }
        return serverUrl
    }
}