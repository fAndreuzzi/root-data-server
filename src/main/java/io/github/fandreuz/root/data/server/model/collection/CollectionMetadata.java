package io.github.fandreuz.root.data.server.model.collection;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;

/**
 * Collection metadata.
 *
 * @author fandreuz
 */
@Getter
// TODO can this be removed?
@Setter
@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class CollectionMetadata implements Comparable<CollectionMetadata> {

   private static final Comparator<CollectionMetadata> COMPARATOR = Comparator.comparing(CollectionMetadata::getId);

   @NonNull
   private String id;

   @NonNull
   private String name;
   @Nonnull
   private String experimentName;
   // Collision, derived or simulated. Didn't want to provide an enum to make it
   // more flexible.
   @Nonnull
   private String type;
   @NonNull
   private String tag;
   @NonNull
   private String citeText;
   @NonNull
   private String doi;

   public CollectionMetadata() {
      // Required by the serialization layer
   }

   @Override
   public int compareTo(@NonNull CollectionMetadata dataset) {
      return COMPARATOR.compare(this, dataset);
   }
}
