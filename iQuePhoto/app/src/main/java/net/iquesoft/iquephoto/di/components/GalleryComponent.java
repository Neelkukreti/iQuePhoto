package net.iquesoft.iquephoto.di.components;

import net.iquesoft.iquephoto.di.ActivityScope;
import net.iquesoft.iquephoto.di.modules.GalleryModule;
import net.iquesoft.iquephoto.ui.activities.GalleryActivity;
import net.iquesoft.iquephoto.ui.fragments.GalleryAlbumsFragment;
import net.iquesoft.iquephoto.ui.fragments.GalleryImagesFragment;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class,
        modules = GalleryModule.class)

public interface GalleryComponent {
    void inject(GalleryActivity galleryActivity);

    void inject(GalleryImagesFragment galleryImagesFragment);

    void inject(GalleryAlbumsFragment galleryAlbumsFragment);
}
