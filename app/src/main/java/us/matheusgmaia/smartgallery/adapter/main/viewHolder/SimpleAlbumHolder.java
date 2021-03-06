package us.matheusgmaia.smartgallery.adapter.main.viewHolder;

import android.view.View;
import android.widget.ImageView;

import us.matheusgmaia.smartgallery.R;
import us.matheusgmaia.smartgallery.data.models.Album;
import us.matheusgmaia.smartgallery.ui.widget.ParallaxImageView;

public class SimpleAlbumHolder extends AlbumHolder {

    public SimpleAlbumHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setAlbum(Album album) {
        super.setAlbum(album);
        final ImageView image = itemView.findViewById(R.id.image);
        if (image instanceof ParallaxImageView) {
            ((ParallaxImageView) image).setParallaxTranslation();
        }
        loadImage(image);
    }
}
