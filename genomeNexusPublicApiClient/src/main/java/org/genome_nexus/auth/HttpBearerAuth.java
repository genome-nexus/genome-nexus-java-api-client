/*
 * Genome Nexus API
 * This page shows how to use HTTP requests to access the Genome Nexus API. There are more high level clients available in Python, R, JavaScript, TypeScript and various other languages as well as a command line client to annotate MAF and VCF. See https://docs.genomenexus.org/api.  Aside from programmatic clients there are web based tools to annotate variants, see https://docs.genomenexus.org/tools.   We currently only provide long-term support for the '/annotation' endpoint. The other endpoints might change.
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.genome_nexus.auth;

import org.genome_nexus.ApiException;
import org.genome_nexus.Pair;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-26T11:53:02.948968527-05:00[America/New_York]")
public class HttpBearerAuth implements Authentication {
  private final String scheme;
  private Supplier<String> tokenSupplier;

  public HttpBearerAuth(String scheme) {
    this.scheme = scheme;
  }

  /**
   * Gets the token, which together with the scheme, will be sent as the value of the Authorization header.
   *
   * @return The bearer token
   */
  public String getBearerToken() {
    return tokenSupplier.get();
  }

  /**
   * Sets the token, which together with the scheme, will be sent as the value of the Authorization header.
   *
   * @param bearerToken The bearer token to send in the Authorization header
   */
  public void setBearerToken(String bearerToken) {
    this.tokenSupplier = () -> bearerToken;
  }

  /**
   * Sets the supplier of tokens, which together with the scheme, will be sent as the value of the Authorization header.
   *
   * @param tokenSupplier The supplier of bearer tokens to send in the Authorization header
   */
  public void setBearerToken(Supplier<String> tokenSupplier) {
    this.tokenSupplier = tokenSupplier;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams,
                            String payload, String method, URI uri) throws ApiException {
    String bearerToken = Optional.ofNullable(tokenSupplier).map(Supplier::get).orElse(null);
    if (bearerToken == null) {
      return;
    }

    headerParams.put("Authorization", (scheme != null ? upperCaseBearer(scheme) + " " : "") + bearerToken);
  }

  private static String upperCaseBearer(String scheme) {
    return ("bearer".equalsIgnoreCase(scheme)) ? "Bearer" : scheme;
  }
}
