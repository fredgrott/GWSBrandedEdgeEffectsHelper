package gws.grottworkshop.gwsbrandededgeeffectshelperapl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import 	android.graphics.PorterDuff;

/**
 * The EdegEffects class uses the Drawable instance is shared, and not mutate so we can hack it for now.
 * Call the brandGlowEffect after each creation of EdgeEffect (after creation of ListView, GridView,
 * ScrollView, or your own instance of EdgeEffect), best place will be in the Activity's onCreate, right after setting the layout.
 *
 *
 * @author Fred Grott
 *
 */
public class BrandEdgeEffectsHelper {

	static void brandGlowEffect(Context context, int brandColor) {
	      //glow
	      int glowDrawableId = context.getResources().getIdentifier("overscroll_glow", "drawable", "android");
	      Drawable androidGlow = context.getResources().getDrawable(glowDrawableId);
	      androidGlow.setColorFilter(brandColor, PorterDuff.Mode.MULTIPLY);
	      //edge
	      int edgeDrawableId = context.getResources().getIdentifier("overscroll_edge", "drawable", "android");
	      Drawable androidEdge = context.getResources().getDrawable(edgeDrawableId);
	      androidEdge.setColorFilter(brandColor, PorterDuff.Mode.MULTIPLY);
	}
}
