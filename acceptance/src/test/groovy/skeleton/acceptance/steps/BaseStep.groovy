package skeleton.acceptance.steps

import org.apache.http.HttpResponse
import org.apache.http.client.HttpClient
import org.apache.http.impl.client.HttpClients

class BaseStep {

    private static final String DEFAULT_SERVER_URL = 'http://localhost:9005/'

    protected HttpClient httpClient = HttpClients.createDefault()

    protected HttpResponse response

    protected static String serverUrl() {
        String envServerUrl = System.getenv("server.url")
        if (envServerUrl == '' || envServerUrl == null) {
            return DEFAULT_SERVER_URL
        } else {
            envServerUrl
        }
    }
}