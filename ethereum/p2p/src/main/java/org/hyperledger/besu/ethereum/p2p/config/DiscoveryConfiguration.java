/*
 * Copyright ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.besu.ethereum.p2p.config;

import static java.util.stream.Collectors.toList;

import org.hyperledger.besu.ethereum.p2p.peers.EnodeURL;
import org.hyperledger.besu.util.NetworkUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DiscoveryConfiguration {
  public static List<EnodeURL> MAINNET_BOOTSTRAP_NODES =
      Collections.unmodifiableList(
          Stream.of(
                  // Ethereum Foundation Bootnodes
                  "enode://d860a01f9722d78051619d1e2351aba3f43f943f6f00718d1b9baa4101932a1f5011f16bb2b1bb35db20d6fe28fa0bf09636d26a87d31de9ec6203eeedb1f666@18.138.108.67:30303", // Singapore AWS
                  "enode://22a8232c3abc76a16ae9d6c3b164f98775fe226f0917b0ca871128a74a8e9630b458460865bab457221f1d448dd9791d24c4e5d88786180ac185df813a68d4de@3.209.45.79:30303", // Virginia AWS
                  "enode://ca6de62fce278f96aea6ec5a2daadb877e51651247cb96ee310a318def462913b653963c155a0ef6c7d50048bba6e6cea881130857413d9f50a621546b590758@34.255.23.113:30303", // Ireland AWS
                  "enode://279944d8dcd428dffaa7436f25ca0ca43ae19e7bcf94a8fb7d1641651f92d121e972ac2e8f381414b80cc8e5555811c2ec6e1a99bb009b3f53c4c69923e11bd8@35.158.244.151:30303", // Frankfurt AWS
                  "enode://8499da03c47d637b20eee24eec3c356c9a2e6148d6fe25ca195c7949ab8ec2c03e3556126b0d7ed644675e78c4318b08691b7b57de10e5f0d40d05b09238fa0a@52.187.207.27:30303", // Australia Azure
                  "enode://103858bdb88756c71f15e9b5e09b56dc1be52f0a5021d46301dbbfb7e130029cc9d0d6f73f693bc29b665770fff7da4d34f3c6379fe12721b5d7a0bcb5ca1fc1@191.234.162.198:30303", // Brazil Azure
                  "enode://715171f50508aba88aecd1250af392a45a330af91d7b90701c436b618c86aaa1589c9184561907bebbb56439b8f8787bc01f49a7c77276c58c1b09822d75e8e8@52.231.165.108:30303", // South Korea Azure
                  "enode://5d6d7cd20d6da4bb83a1d28cadb5d409b64edf314c0335df658c1a54e32c7c4a7ab7823d57c39b6a757556e68ff1df17c748b698544a55cb488b52479a92b60f@104.42.217.25:30303", // West US Azure

                  // Old Ethereum Foundation Bootnodes
                  "enode://a979fb575495b8d6db44f750317d0f4622bf4c2aa3365d6af7c284339968eef29b69ad0dce72a4d8db5ebb4968de0e3bec910127f134779fbcb0cb6d3331163c@52.16.188.185:30303", // IE
                  "enode://3f1d12044546b76342d59d4a05532c14b85aa669704bfe1f864fe079415aa2c02d743e03218e57a33fb94523adb54032871a6c51b2cc5514cb7c7e35b3ed0a99@13.93.211.84:30303", // US-WEST
                  "enode://78de8a0916848093c73790ead81d1928bec737d565119932b98c6b100d944b7a95e94f847f689fc723399d2e31129d182f7ef3863f2b4c820abbf3ab2722344d@191.235.84.50:30303", // BR
                  "enode://158f8aab45f6d19c6cbf4a089c2670541a8da11978a2f90dbf6a502a4a3bab80d288afdbeb7ec0ef6d92de563767f3b1ea9e8e334ca711e9f8e2df5a0385e8e6@13.75.154.138:30303", // AU
                  "enode://1118980bf48b0a3640bdba04e0fe78b1add18e1cd99bf22d53daac1fd9972ad650df52176e7c7d89d1114cfef2bc23a2959aa54998a46afcf7d91809f0855082@52.74.57.123:30303", // SG

                  // Ethereum Foundation Aleth Bootnodes
                  "enode://979b7fa28feeb35a4741660a16076f1943202cb72b6af70d327f053e248bab9ba81760f39d0701ef1d8f89cc1fbd2cacba0710a12cd5314d5e0c9021aa3637f9@5.1.83.226:30303" // DE
                  )
              .map(EnodeURL::fromString)
              .collect(toList()));
  public static List<EnodeURL> RINKEBY_BOOTSTRAP_NODES =
      Collections.unmodifiableList(
          Stream.of(
                  "enode://a24ac7c5484ef4ed0c5eb2d36620ba4e4aa13b8c84684e1b4aab0cebea2ae45cb4d375b77eab56516d34bfbd3c1a833fc51296ff084b770b94fb9028c4d25ccf@52.169.42.101:30303",
                  "enode://343149e4feefa15d882d9fe4ac7d88f885bd05ebb735e547f12e12080a9fa07c8014ca6fd7f373123488102fe5e34111f8509cf0b7de3f5b44339c9f25e87cb8@52.3.158.184:30303",
                  "enode://b6b28890b006743680c52e64e0d16db57f28124885595fa03a562be1d2bf0f3a1da297d56b13da25fb992888fd556d4c1a27b1f39d531bde7de1921c90061cc6@159.89.28.211:30303")
              .map(EnodeURL::fromString)
              .collect(toList()));
  public static List<EnodeURL> ROPSTEN_BOOTSTRAP_NODES =
      Collections.unmodifiableList(
          Stream.of(
                  "enode://6332792c4a00e3e4ee0926ed89e0d27ef985424d97b6a45bf0f23e51f0dcb5e66b875777506458aea7af6f9e4ffb69f43f3778ee73c81ed9d34c51c4b16b0b0f@52.232.243.152:30303",
                  "enode://94c15d1b9e2fe7ce56e458b9a3b672ef11894ddedd0c6f247e0f1d3487f52b66208fb4aeb8179fce6e3a749ea93ed147c37976d67af557508d199d9594c35f09@192.81.208.223:30303",
                  "enode://30b7ab30a01c124a6cceca36863ece12c4f5fa68e3ba9b0b51407ccc002eeed3b3102d20a88f1c1d3c3154e2449317b8ef95090e77b312d5cc39354f86d5d606@52.176.7.10:30303",
                  "enode://865a63255b3bb68023b6bffd5095118fcc13e79dcf014fe4e47e065c350c7cc72af2e53eff895f11ba1bbb6a2b33271c1116ee870f266618eadfc2e78aa7349c@52.176.100.77:30303")
              .map(EnodeURL::fromString)
              .collect(toList()));

  public static List<EnodeURL> GOERLI_BOOTSTRAP_NODES =
      Collections.unmodifiableList(
          Stream.of(
                  "enode://011f758e6552d105183b1761c5e2dea0111bc20fd5f6422bc7f91e0fabbec9a6595caf6239b37feb773dddd3f87240d99d859431891e4a642cf2a0a9e6cbb98a@51.141.78.53:30303",
                  "enode://176b9417f511d05b6b2cf3e34b756cf0a7096b3094572a8f6ef4cdcb9d1f9d00683bf0f83347eebdf3b81c3521c2332086d9592802230bf528eaf606a1d9677b@13.93.54.137:30303",
                  "enode://46add44b9f13965f7b9875ac6b85f016f341012d84f975377573800a863526f4da19ae2c620ec73d11591fa9510e992ecc03ad0751f53cc02f7c7ed6d55c7291@94.237.54.114:30313",
                  "enode://b5948a2d3e9d486c4d75bf32713221c2bd6cf86463302339299bd227dc2e276cd5a1c7ca4f43a0e9122fe9af884efed563bd2a1fd28661f3b5f5ad7bf1de5949@18.218.250.66:30303")
              .map(EnodeURL::fromString)
              .collect(toList()));

  public static List<EnodeURL> CLASSIC_BOOTSTRAP_NODES =
      Collections.unmodifiableList(
          Stream.of(
                  "enode://158ac5a4817265d0d8b977660b3dbe9abee5694ed212f7091cbf784ddf47623ed015e1cb54594d10c1c46118747ddabe86ebf569cf24ae91f2daa0f1adaae390@159.203.56.33:30303",
                  "enode://efd48ad0879eeb7f9cb5e50f33f7bc21e805a72e90361f145baaa22dd75d111e7cd9c93f1b7060dcb30aa1b3e620269336dbf32339fea4c18925a4c15fe642df@18.205.66.229:30303",
                  "enode://5fbfb426fbb46f8b8c1bd3dd140f5b511da558cd37d60844b525909ab82e13a25ee722293c829e52cb65c2305b1637fa9a2ea4d6634a224d5f400bfe244ac0de@162.243.55.45:30303",
                  "enode://6dd3ac8147fa82e46837ec8c3223d69ac24bcdbab04b036a3705c14f3a02e968f7f1adfcdb002aacec2db46e625c04bf8b5a1f85bb2d40a479b3cc9d45a444af@104.237.131.102:30303",
                  "enode://b9e893ea9cb4537f4fed154233005ae61b441cd0ecd980136138c304fefac194c25a16b73dac05fc66a4198d0c15dd0f33af99b411882c68a019dfa6bb703b9d@18.130.93.66:30303",
                  "enode://3fe9705a02487baea45c1ffebfa4d84819f5f1e68a0dbc18031553242a6a08e39499b61e361a52c2a92f9553efd63763f6fdd34692be0d4ba6823bb2fc346009@178.62.238.75:30303",
                  "enode://d50facc65e46bda6ff594b6e95491efa16e067de41ae96571d9f3cb853d538c44864496fa5e4df10115f02bbbaf47853f932e110a44c89227da7c30e96840596@188.166.163.187:30303",
                  "enode://a0d5c589dc02d008fe4237da9877a5f1daedee0227ab612677eabe323520f003eb5e311af335de9f7964c2092bbc2b3b7ab1cce5a074d8346959f0868b4e366e@46.101.78.44:30303",
                  "enode://c071d96b0c0f13006feae3977fb1b3c2f62caedf643df9a3655bc1b60f777f05e69a4e58bf3547bb299210092764c56df1e08380e91265baa845dca8bc0a71da@68.183.99.5:30303",
                  "enode://83b33409349ffa25e150555f7b4f8deebc68f3d34d782129dc3c8ba07b880c209310a4191e1725f2f6bef59bce9452d821111eaa786deab08a7e6551fca41f4f@206.189.68.191:30303",
                  "enode://0daae2a30f2c73b0b257746587136efb8e3479496f7ea1e943eeb9a663b72dd04582f699f7010ee02c57fc45d1f09568c20a9050ff937f9139e2973ddd98b87b@159.89.169.103:30303",
                  "enode://50808461dd73b3d70537e4c1e5fafd1132b3a90f998399af9205f8889987d62096d4e853813562dd43e7270a71c9d9d4e4dd73a534fdb22fbac98c389c1a7362@178.128.55.119:30303",
                  "enode://5cd218959f8263bc3721d7789070806b0adff1a0ed3f95ec886fb469f9362c7507e3b32b256550b9a7964a23a938e8d42d45a0c34b332bfebc54b29081e83b93@35.187.57.94:30303",
                  "enode://66498ac935f3f54d873de4719bf2d6d61e0c74dd173b547531325bcef331480f9bedece91099810971c8567eeb1ae9f6954b013c47c6dc51355bbbbae65a8c16@54.148.165.1:30303",
                  "enode://73e74ce7426a17aa2d8b5bb64d796ec7dc4dcee2af9bbdd4434394d1e4e52e650b9e39202435fca29ce65c242fd6e59b93ed2cf37f04b645fb23e306273816ad@54.148.165.1:30304",
                  "enode://8809dadb6e6145bbbce832f8e3cb54f23c84db1c4957dac04be26157a16eceb91bb2567e3a2eb794bf8e7df937fd2de46d4214416d3c199f05d3b6fa76a5ef6d@51.141.115.3:30303")
              .map(EnodeURL::fromString)
              .collect(toList()));

  public static List<EnodeURL> KOTTI_BOOTSTRAP_NODES =
      Collections.unmodifiableList(
          Stream.of(
                  "enode://06333009fc9ef3c9e174768e495722a7f98fe7afd4660542e983005f85e556028410fd03278944f44cfe5437b1750b5e6bd1738f700fe7da3626d52010d2954c@51.141.15.254:30303",
                  "enode://93c94e999be5dd854c5d82a7cf5c14822973b5d9badb56ad4974586ec4d4f1995c815af795c20bb6e0a6226d3ee55808435c4dc89baf94ee581141b064d19dfc@80.187.116.161:25720",
                  "enode://ae8658da8d255d1992c3ec6e62e11d6e1c5899aa1566504bc1ff96a0c9c8bd44838372be643342553817f5cc7d78f1c83a8093dee13d77b3b0a583c050c81940@18.232.185.151:30303",
                  "enode://b477ca6d507a3f57070783eb62ba838847635f8b1a0cbffb8b7f8173f5894cf550f0225a5c279341e2d862a606e778b57180a4f1db3db78c51eadcfa4fdc6963@40.68.240.160:30303")
              .map(EnodeURL::fromString)
              .collect(toList()));

  private boolean active = true;
  private String bindHost = NetworkUtility.INADDR_ANY;
  private int bindPort = 30303;
  private String advertisedHost = "127.0.0.1";
  private int bucketSize = 16;
  private List<EnodeURL> bootnodes = new ArrayList<>();

  public static DiscoveryConfiguration create() {
    return new DiscoveryConfiguration();
  }

  public static void assertValidBootnodes(final List<EnodeURL> bootnodes) {
    final List<EnodeURL> invalidEnodes =
        bootnodes.stream().filter(e -> !e.isRunningDiscovery()).collect(Collectors.toList());

    if (invalidEnodes.size() > 0) {
      String invalidBootnodes =
          invalidEnodes.stream().map(EnodeURL::toString).collect(Collectors.joining(","));
      String errorMsg =
          "Bootnodes must have discovery enabled. Invalid bootnodes: " + invalidBootnodes + ".";
      throw new IllegalArgumentException(errorMsg);
    }
  }

  public String getBindHost() {
    return bindHost;
  }

  public DiscoveryConfiguration setBindHost(final String bindHost) {
    this.bindHost = bindHost;
    return this;
  }

  public int getBindPort() {
    return bindPort;
  }

  public DiscoveryConfiguration setBindPort(final int bindPort) {
    this.bindPort = bindPort;
    return this;
  }

  public boolean isActive() {
    return active;
  }

  public DiscoveryConfiguration setActive(final boolean active) {
    this.active = active;
    return this;
  }

  public List<EnodeURL> getBootnodes() {
    return bootnodes;
  }

  public DiscoveryConfiguration setBootnodes(final List<EnodeURL> bootnodes) {
    assertValidBootnodes(bootnodes);
    this.bootnodes = bootnodes;
    return this;
  }

  public String getAdvertisedHost() {
    return advertisedHost;
  }

  public DiscoveryConfiguration setAdvertisedHost(final String advertisedHost) {
    this.advertisedHost = advertisedHost;
    return this;
  }

  public int getBucketSize() {
    return bucketSize;
  }

  public DiscoveryConfiguration setBucketSize(final int bucketSize) {
    this.bucketSize = bucketSize;
    return this;
  }

  @Override
  public boolean equals(final Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof DiscoveryConfiguration)) {
      return false;
    }
    final DiscoveryConfiguration that = (DiscoveryConfiguration) o;
    return active == that.active
        && bindPort == that.bindPort
        && bucketSize == that.bucketSize
        && Objects.equals(bindHost, that.bindHost)
        && Objects.equals(advertisedHost, that.advertisedHost)
        && Objects.equals(bootnodes, that.bootnodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, bindHost, bindPort, advertisedHost, bucketSize, bootnodes);
  }

  @Override
  public String toString() {
    return "DiscoveryConfiguration{"
        + "active="
        + active
        + ", bindHost='"
        + bindHost
        + '\''
        + ", bindPort="
        + bindPort
        + ", advertisedHost='"
        + advertisedHost
        + '\''
        + ", bucketSize="
        + bucketSize
        + ", bootnodes="
        + bootnodes
        + '}';
  }
}
