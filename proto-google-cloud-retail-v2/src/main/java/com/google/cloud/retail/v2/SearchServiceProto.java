/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/search_service.proto

package com.google.cloud.retail.v2;

public final class SearchServiceProto {
  private SearchServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_FacetKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_FacetKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_DynamicFacetSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_DynamicFacetSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_ConditionBoostSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_ConditionBoostSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_QueryExpansionSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_QueryExpansionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_MatchingVariantFieldsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_MatchingVariantFieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_VariantRollupValuesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_VariantRollupValuesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchResponse_Facet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchResponse_Facet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchResponse_Facet_FacetValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchResponse_Facet_FacetValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchResponse_QueryExpansionInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchResponse_QueryExpansionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/retail/v2/search_service."
          + "proto\022\026google.cloud.retail.v2\032\034google/ap"
          + "i/annotations.proto\032\027google/api/client.p"
          + "roto\032\037google/api/field_behavior.proto\032\031g"
          + "oogle/api/resource.proto\032#google/cloud/r"
          + "etail/v2/common.proto\032$google/cloud/reta"
          + "il/v2/product.proto\032 google/protobuf/fie"
          + "ld_mask.proto\032\034google/protobuf/struct.pr"
          + "oto\032\037google/protobuf/timestamp.proto\032\036go"
          + "ogle/protobuf/wrappers.proto\"\351\013\n\rSearchR"
          + "equest\022\026\n\tplacement\030\001 \001(\tB\003\340A\002\0221\n\006branch"
          + "\030\002 \001(\tB!\372A\036\n\034retail.googleapis.com/Branc"
          + "h\022\r\n\005query\030\003 \001(\t\022\027\n\nvisitor_id\030\004 \001(\tB\003\340A"
          + "\002\0223\n\tuser_info\030\005 \001(\0132 .google.cloud.reta"
          + "il.v2.UserInfo\022\021\n\tpage_size\030\007 \001(\005\022\022\n\npag"
          + "e_token\030\010 \001(\t\022\016\n\006offset\030\t \001(\005\022\016\n\006filter\030"
          + "\n \001(\t\022\030\n\020canonical_filter\030\034 \001(\t\022\020\n\010order"
          + "_by\030\013 \001(\t\022D\n\013facet_specs\030\014 \003(\0132/.google."
          + "cloud.retail.v2.SearchRequest.FacetSpec\022"
          + "R\n\022dynamic_facet_spec\030\025 \001(\01326.google.clo"
          + "ud.retail.v2.SearchRequest.DynamicFacetS"
          + "pec\022C\n\nboost_spec\030\r \001(\0132/.google.cloud.r"
          + "etail.v2.SearchRequest.BoostSpec\022V\n\024quer"
          + "y_expansion_spec\030\016 \001(\01328.google.cloud.re"
          + "tail.v2.SearchRequest.QueryExpansionSpec"
          + "\022\033\n\023variant_rollup_keys\030\021 \003(\t\022\027\n\017page_ca"
          + "tegories\030\027 \003(\t\032\337\002\n\tFacetSpec\022P\n\tfacet_ke"
          + "y\030\001 \001(\01328.google.cloud.retail.v2.SearchR"
          + "equest.FacetSpec.FacetKeyB\003\340A\002\022\r\n\005limit\030"
          + "\002 \001(\005\022\034\n\024excluded_filter_keys\030\003 \003(\t\022\037\n\027e"
          + "nable_dynamic_position\030\004 \001(\010\032\261\001\n\010FacetKe"
          + "y\022\020\n\003key\030\001 \001(\tB\003\340A\002\0223\n\tintervals\030\002 \003(\0132 "
          + ".google.cloud.retail.v2.Interval\022\031\n\021rest"
          + "ricted_values\030\003 \003(\t\022\020\n\010prefixes\030\010 \003(\t\022\020\n"
          + "\010contains\030\t \003(\t\022\020\n\010order_by\030\004 \001(\t\022\r\n\005que"
          + "ry\030\005 \001(\t\032\226\001\n\020DynamicFacetSpec\022I\n\004mode\030\001 "
          + "\001(\0162;.google.cloud.retail.v2.SearchReque"
          + "st.DynamicFacetSpec.Mode\"7\n\004Mode\022\024\n\020MODE"
          + "_UNSPECIFIED\020\000\022\014\n\010DISABLED\020\001\022\013\n\007ENABLED\020"
          + "\002\032\246\001\n\tBoostSpec\022a\n\025condition_boost_specs"
          + "\030\001 \003(\0132B.google.cloud.retail.v2.SearchRe"
          + "quest.BoostSpec.ConditionBoostSpec\0326\n\022Co"
          + "nditionBoostSpec\022\021\n\tcondition\030\001 \001(\t\022\r\n\005b"
          + "oost\030\002 \001(\002\032\253\001\n\022QueryExpansionSpec\022U\n\tcon"
          + "dition\030\001 \001(\0162B.google.cloud.retail.v2.Se"
          + "archRequest.QueryExpansionSpec.Condition"
          + "\">\n\tCondition\022\031\n\025CONDITION_UNSPECIFIED\020\000"
          + "\022\014\n\010DISABLED\020\001\022\010\n\004AUTO\020\003\"\367\010\n\016SearchRespo"
          + "nse\022D\n\007results\030\001 \003(\01323.google.cloud.reta"
          + "il.v2.SearchResponse.SearchResult\022<\n\006fac"
          + "ets\030\002 \003(\0132,.google.cloud.retail.v2.Searc"
          + "hResponse.Facet\022\022\n\ntotal_size\030\003 \001(\005\022\027\n\017c"
          + "orrected_query\030\004 \001(\t\022\031\n\021attribution_toke"
          + "n\030\005 \001(\t\022\027\n\017next_page_token\030\006 \001(\t\022W\n\024quer"
          + "y_expansion_info\030\007 \001(\01329.google.cloud.re"
          + "tail.v2.SearchResponse.QueryExpansionInf"
          + "o\022\024\n\014redirect_uri\030\n \001(\t\032\370\003\n\014SearchResult"
          + "\022\n\n\002id\030\001 \001(\t\0220\n\007product\030\002 \001(\0132\037.google.c"
          + "loud.retail.v2.Product\022\036\n\026matching_varia"
          + "nt_count\030\003 \001(\005\022o\n\027matching_variant_field"
          + "s\030\004 \003(\0132N.google.cloud.retail.v2.SearchR"
          + "esponse.SearchResult.MatchingVariantFiel"
          + "dsEntry\022k\n\025variant_rollup_values\030\005 \003(\0132L"
          + ".google.cloud.retail.v2.SearchResponse.S"
          + "earchResult.VariantRollupValuesEntry\032X\n\032"
          + "MatchingVariantFieldsEntry\022\013\n\003key\030\001 \001(\t\022"
          + ")\n\005value\030\002 \001(\0132\032.google.protobuf.FieldMa"
          + "sk:\0028\001\032R\n\030VariantRollupValuesEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.google.protobuf"
          + ".Value:\0028\001\032\347\001\n\005Facet\022\013\n\003key\030\001 \001(\t\022G\n\006val"
          + "ues\030\002 \003(\01327.google.cloud.retail.v2.Searc"
          + "hResponse.Facet.FacetValue\022\025\n\rdynamic_fa"
          + "cet\030\003 \001(\010\032q\n\nFacetValue\022\017\n\005value\030\001 \001(\tH\000"
          + "\0224\n\010interval\030\002 \001(\0132 .google.cloud.retail"
          + ".v2.IntervalH\000\022\r\n\005count\030\003 \001(\003B\r\n\013facet_v"
          + "alue\032,\n\022QueryExpansionInfo\022\026\n\016expanded_q"
          + "uery\030\001 \001(\0102\206\002\n\rSearchService\022\251\001\n\006Search\022"
          + "%.google.cloud.retail.v2.SearchRequest\032&"
          + ".google.cloud.retail.v2.SearchResponse\"P"
          + "\202\323\344\223\002J\"E/v2/{placement=projects/*/locati"
          + "ons/*/catalogs/*/placements/*}:search:\001*"
          + "\032I\312A\025retail.googleapis.com\322A.https://www"
          + ".googleapis.com/auth/cloud-platformB\307\001\n\032"
          + "com.google.cloud.retail.v2B\022SearchServic"
          + "eProtoP\001Z<google.golang.org/genproto/goo"
          + "gleapis/cloud/retail/v2;retail\242\002\006RETAIL\252"
          + "\002\026Google.Cloud.Retail.V2\312\002\026Google\\Cloud\\"
          + "Retail\\V2\352\002\031Google::Cloud::Retail::V2b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2.CommonProto.getDescriptor(),
              com.google.cloud.retail.v2.ProductProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_SearchRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_SearchRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_descriptor,
            new java.lang.String[] {
              "Placement",
              "Branch",
              "Query",
              "VisitorId",
              "UserInfo",
              "PageSize",
              "PageToken",
              "Offset",
              "Filter",
              "CanonicalFilter",
              "OrderBy",
              "FacetSpecs",
              "DynamicFacetSpec",
              "BoostSpec",
              "QueryExpansionSpec",
              "VariantRollupKeys",
              "PageCategories",
            });
    internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_descriptor =
        internal_static_google_cloud_retail_v2_SearchRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_descriptor,
            new java.lang.String[] {
              "FacetKey", "Limit", "ExcludedFilterKeys", "EnableDynamicPosition",
            });
    internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_FacetKey_descriptor =
        internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_FacetKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_FacetKey_descriptor,
            new java.lang.String[] {
              "Key", "Intervals", "RestrictedValues", "Prefixes", "Contains", "OrderBy", "Query",
            });
    internal_static_google_cloud_retail_v2_SearchRequest_DynamicFacetSpec_descriptor =
        internal_static_google_cloud_retail_v2_SearchRequest_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_retail_v2_SearchRequest_DynamicFacetSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_DynamicFacetSpec_descriptor,
            new java.lang.String[] {
              "Mode",
            });
    internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_descriptor =
        internal_static_google_cloud_retail_v2_SearchRequest_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_descriptor,
            new java.lang.String[] {
              "ConditionBoostSpecs",
            });
    internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_ConditionBoostSpec_descriptor =
        internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_ConditionBoostSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_ConditionBoostSpec_descriptor,
            new java.lang.String[] {
              "Condition", "Boost",
            });
    internal_static_google_cloud_retail_v2_SearchRequest_QueryExpansionSpec_descriptor =
        internal_static_google_cloud_retail_v2_SearchRequest_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_retail_v2_SearchRequest_QueryExpansionSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_QueryExpansionSpec_descriptor,
            new java.lang.String[] {
              "Condition",
            });
    internal_static_google_cloud_retail_v2_SearchResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2_SearchResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchResponse_descriptor,
            new java.lang.String[] {
              "Results",
              "Facets",
              "TotalSize",
              "CorrectedQuery",
              "AttributionToken",
              "NextPageToken",
              "QueryExpansionInfo",
              "RedirectUri",
            });
    internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_descriptor =
        internal_static_google_cloud_retail_v2_SearchResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_descriptor,
            new java.lang.String[] {
              "Id",
              "Product",
              "MatchingVariantCount",
              "MatchingVariantFields",
              "VariantRollupValues",
            });
    internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_MatchingVariantFieldsEntry_descriptor =
        internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_MatchingVariantFieldsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_MatchingVariantFieldsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_VariantRollupValuesEntry_descriptor =
        internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_VariantRollupValuesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_VariantRollupValuesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2_SearchResponse_Facet_descriptor =
        internal_static_google_cloud_retail_v2_SearchResponse_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_retail_v2_SearchResponse_Facet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchResponse_Facet_descriptor,
            new java.lang.String[] {
              "Key", "Values", "DynamicFacet",
            });
    internal_static_google_cloud_retail_v2_SearchResponse_Facet_FacetValue_descriptor =
        internal_static_google_cloud_retail_v2_SearchResponse_Facet_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2_SearchResponse_Facet_FacetValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchResponse_Facet_FacetValue_descriptor,
            new java.lang.String[] {
              "Value", "Interval", "Count", "FacetValue",
            });
    internal_static_google_cloud_retail_v2_SearchResponse_QueryExpansionInfo_descriptor =
        internal_static_google_cloud_retail_v2_SearchResponse_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_retail_v2_SearchResponse_QueryExpansionInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchResponse_QueryExpansionInfo_descriptor,
            new java.lang.String[] {
              "ExpandedQuery",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2.CommonProto.getDescriptor();
    com.google.cloud.retail.v2.ProductProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
